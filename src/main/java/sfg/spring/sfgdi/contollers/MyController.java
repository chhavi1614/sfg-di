package sfg.spring.sfgdi.contollers;

import org.springframework.stereotype.Controller;
import sfg.spring.sfgdi.services.GreetingServices;

@Controller
public class MyController {
    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        System.out.println("Hello World!!!");
        return "Hi Folks!";
    }
}
