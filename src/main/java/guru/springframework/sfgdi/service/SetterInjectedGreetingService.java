package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from --- Setter";
	}

}
