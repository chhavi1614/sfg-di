package sfg.spring.sfgdi.contollers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.spring.sfgdi.services.GreetingServices;

@Controller
public class ConstructorInjectedController {

    private final GreetingServices greetingServices;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServices") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String sayGreeting(){
        return greetingServices.sayGreeting();
    }
}
