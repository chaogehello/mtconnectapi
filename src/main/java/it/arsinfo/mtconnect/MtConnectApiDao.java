package it.arsinfo.mtconnect;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.arsinfo.mtconnect.streams.AvailabilityType;
import it.arsinfo.mtconnect.streams.EmergencyStopType;
import it.arsinfo.mtconnect.streams.MTConnectStreamsType;



@Service
public class MtConnectApiDao {
	
	
    private final AtomicLong counter = new AtomicLong();

	@Autowired
	private RestTemplate restTemplate;

	@Value("${mtconnect.remote.url}")
    private String mtconnectRemoteUrl;

	
	public String getMtconnectRemoteUrl() {
		return mtconnectRemoteUrl;
	}
	public void setMtconnectRemoteUrl(String mtconnectRemoteUrl) {
		this.mtconnectRemoteUrl = mtconnectRemoteUrl;
	}
	private MTConnectStreamsType get() {
		return restTemplate.getForObject(
				mtconnectRemoteUrl, MTConnectStreamsType.class);		
	}
	public List<Event> getEvents(String name) {
		final List<Event> events = new ArrayList<>();
		get().getStreams().getDeviceStream().forEach( devStream -> {
			devStream.getComponentStream().stream()
				.filter(cs -> cs.getEvents() != null)
				.forEach(cs -> {
					cs.getEvents().getEvent().stream()
					.filter(e -> e!= null)
					.forEach(e -> {
						if (e.getValue() != null && "avail".equals(e.getValue().getName())) {
							AvailabilityType avail = (AvailabilityType) e.getValue();
							events.add(new Event(
									avail.getSequence().longValue(),devStream.getName(),
									cs.getName(),"Availability",
									avail.getValue()));
						} else if (e.getValue() != null && "estop".equals(e.getValue().getName())) {
							EmergencyStopType estop = (EmergencyStopType) e.getValue();
							events.add(new Event(
									estop.getSequence().longValue(),devStream.getName(),
									cs.getName(),"EmergencyStop",
									estop.getValue()));
							} else {
							events.add(new Event(counter.incrementAndGet(),
									devStream.getName(),
									cs.getName(),
									e.getClass().toString(),
								e.getValue().getName()));
						}
				});
			});
			events.forEach(eve -> eve.log());
		
		});

		return events;
	}

	public List<Condition> getConditions(String name) {
		final List<Condition> conditions = new ArrayList<>();
		get().getStreams().getDeviceStream().forEach( devStream -> {
			devStream.getComponentStream().stream()
				.filter(cs -> cs.getCondition() != null)
				.forEach(cs -> {
					cs.getCondition().getCondition().stream()
					.filter(c -> c!= null)
					.forEach(e -> {
						conditions.add(new Condition(counter.incrementAndGet(),
									devStream.getName(),
									cs.getName(),
									e.getClass().toString(),
									e.getValue().getType(),
								e.getValue().getName()));
				});
			});
			conditions.forEach(cond -> cond.toString());
		
		});
		return conditions;
	}
}
