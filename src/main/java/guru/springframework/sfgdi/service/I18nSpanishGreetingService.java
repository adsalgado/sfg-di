package guru.springframework.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Qualifier("i18nService")
@Service
public class I18nSpanishGreetingService implements IGreetingService  {

	@Override
	public String sayHello() {
		return "Hola mundo! - ES";
	}

}
