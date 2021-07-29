package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.IGreetingService;

@Controller
public class I18nController {
	
	private final IGreetingService greetingService;

	public I18nController(@Qualifier("i18nService") IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}	

}
