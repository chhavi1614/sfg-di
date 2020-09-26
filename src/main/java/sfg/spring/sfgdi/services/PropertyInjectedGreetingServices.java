package sfg.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
