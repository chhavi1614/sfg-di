package sfg.spring.sfgdi.contollers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.spring.sfgdi.services.ConstructorGreetingServices;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServices());
    }

    @Test
    void sayGreetingServices() {
        System.out.println(controller.sayGreeting());
    }
}