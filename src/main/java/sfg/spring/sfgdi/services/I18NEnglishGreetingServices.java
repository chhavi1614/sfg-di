package sfg.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class I18NEnglishGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
