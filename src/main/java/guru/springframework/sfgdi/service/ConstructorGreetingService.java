package guru.springframework.sfgdi.service;

public class ConstructorGreetingService implements IGreetingService {

	@Override
	public String sayHello() {
		return "Hello from --- Constructor";
	}

}
