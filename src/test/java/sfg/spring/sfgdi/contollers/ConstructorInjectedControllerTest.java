package sfg.spring.sfgdi.contollers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.spring.sfgdi.services.ConstructorGreetingServices;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServices());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}