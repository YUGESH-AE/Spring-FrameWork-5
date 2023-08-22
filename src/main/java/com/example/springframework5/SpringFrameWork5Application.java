package com.example.springframework5;

import com.example.springframework5.controllers.*;
import com.example.springframework5.controllers.PropertyInjecton.PropertyInjectedController;
import com.example.springframework5.controllers.constructorInjection.ConstructorInjectedController;
import com.example.springframework5.controllers.primaryBean.PrimaryBeanController;
import com.example.springframework5.controllers.setterInjection.SetterInjectedController;
import com.example.springframework5.controllers.springProfile.SpringProfileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameWork5Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringFrameWork5Application.class, args);

		MyController controller=context.getBean(MyController.class);
		String greetings=controller.sayHello();
		System.out.println(greetings);

		System.out.println("--------------------------PropertyInjectedController Controller-----------------------------");

		PropertyInjectedController propertyInjectedController=context.getBean(PropertyInjectedController.class);
		String greetings1=propertyInjectedController.getGreetings();
		System.out.println(greetings1);

		System.out.println("--------------------------ConstructorInjectedController Controller--------------------------");
		ConstructorInjectedController constructorInjectedController =context.getBean(ConstructorInjectedController.class);
		String greetings2=constructorInjectedController.getGreetings();
		System.out.println(greetings2);
		System.out.println("--------------------------SetterInjectedController Controller-------------------------------");
		SetterInjectedController setterInjectedController=context.getBean(SetterInjectedController.class);
		String greetings3=setterInjectedController.getGreetings();
		System.out.println(greetings2);
		System.out.println("--------------------------SetterInjectedController Controller-------------------------------");
		PrimaryBeanController primaryBeanController = context.getBean(PrimaryBeanController.class);
		String greeting4= primaryBeanController.getGreeting();
		System.out.println(greeting4);
		System.out.println("--------------------------SpringProfile Controller------------------------------------------");
		SpringProfileController springProfileController= context.getBean(SpringProfileController.class);
		String greeting5= springProfileController.getGreeting();
		System.out.println(greeting5);

	}

}
