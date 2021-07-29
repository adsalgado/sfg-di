package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from --- PRIMARY";
	}

}
