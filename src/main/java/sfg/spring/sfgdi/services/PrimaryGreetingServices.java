package sfg.spring.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Primary Bean";
    }
}
