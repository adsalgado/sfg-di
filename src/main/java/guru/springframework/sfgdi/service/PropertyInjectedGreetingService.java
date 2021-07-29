package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from --- PropertyInjected";
	}

}
