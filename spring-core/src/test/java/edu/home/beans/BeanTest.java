package edu.home.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class BeanTest {
	public static void main(String[] args) {
		// Spring Container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C://Users//ahmed//onlineworkspace//SPRING-CORE//src//main//resources//applicationContext.xml")); // spring
																													// container

		// Spring Framework
		// ApplicationContext factory = new
		// ClassPathXmlApplicationContext("applicationContext.xml"); //spring
		// framework

		System.out.println("After Container Created");

		GreetingService gs1 = (GreetingService) factory.getBean("gs1");
		GreetingService gs2 = (GreetingService) factory.getBean("gs2");

		gs1.sayGreeting();
		gs2.sayGreeting();
	}
}
