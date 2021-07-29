package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.service.I18nEnglishGreetingService;

@Configuration
public class BeanSpringConfig {

	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService() {
		return new I18nEnglishGreetingService();
	}
	
}
