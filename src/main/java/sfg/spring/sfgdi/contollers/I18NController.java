package sfg.spring.sfgdi.contollers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.spring.sfgdi.services.GreetingServices;

@Controller
public class I18NController {
    private final GreetingServices greetingServices;

    public I18NController(@Qualifier("i18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public  String sayHello(){
       return greetingServices.sayGreeting();
    }
}
