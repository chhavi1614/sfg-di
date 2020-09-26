package sfg.spring.sfgdi.contollers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.spring.sfgdi.services.ConstructorGreetingServices;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void setUP(){
        controller = new PropertyInjectedController();
        controller.greetingServices  = new ConstructorGreetingServices();
    }
    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}