package sfg.spring.sfgdi.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.spring.sfgdi.services.GreetingServices;

@Controller
public class SetterInjectedController {

    private GreetingServices greetingServices;

    @Autowired
    public void setGreetingServices(@Qualifier("setterInjectedGreetingServices") GreetingServices  greetingServices )
    {
        this.greetingServices = greetingServices;
    }
    //Setter
    public String sayGreeting(){
        return greetingServices.sayGreeting();
    }
}
