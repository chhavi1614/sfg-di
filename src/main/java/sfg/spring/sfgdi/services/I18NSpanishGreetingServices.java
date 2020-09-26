package sfg.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
