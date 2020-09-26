package sfg.spring.sfgdi.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.spring.sfgdi.services.GreetingServices;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServices")
    @Autowired
    public GreetingServices greetingServices;

    public String sayGreeting(){
        return greetingServices.sayGreeting();
    }


}
