package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.IGreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	private IGreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
}
