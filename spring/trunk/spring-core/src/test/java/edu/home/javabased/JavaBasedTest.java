package edu.home.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.home.javabased.GreetingService;
import edu.home.javabased.config.AppConfig;

public class JavaBasedTest {

	public static void main(String[] args) {
		// Spring Framework

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		GreetingService gs1 = (GreetingService) context.getBean("gs1");
		GreetingService gs2 = (GreetingService) context.getBean("gs2");

		gs1.sayGreeting();
		gs2.sayGreeting();
	}

}
