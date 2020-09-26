package sfg.spring.sfgdi.services;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
