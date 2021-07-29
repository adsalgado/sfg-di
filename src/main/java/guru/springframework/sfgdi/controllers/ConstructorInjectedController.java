package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.IGreetingService;

@Controller
public class ConstructorInjectedController {

	private final IGreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}
}
