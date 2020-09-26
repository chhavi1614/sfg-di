package sfg.spring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sfg.spring.sfgdi.contollers.ConstructorInjectedController;
import sfg.spring.sfgdi.contollers.MyController;
import sfg.spring.sfgdi.contollers.PropertyInjectedController;
import sfg.spring.sfgdi.contollers.SetterInjectedController;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("----------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean(("propertyInjectedController"));
		System.out.println(propertyInjectedController.sayGreeting());

		System.out.println("----------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(("setterInjectedController"));
		System.out.println(setterInjectedController.sayGreeting());

		System.out.println("----------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(("constructorInjectedController"));
		System.out.println(constructorInjectedController.sayGreeting());
	}

}
