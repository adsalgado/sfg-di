package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.IGreetingService;

@Controller
public class SetterInjectedController {

	private IGreetingService greetingService;

	@Autowired
	@Qualifier("setterInjectedGreetingService")
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}
}
