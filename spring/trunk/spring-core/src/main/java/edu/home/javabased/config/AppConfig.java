package edu.home.javabased.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.home.javabased.GreetingService;
import edu.home.javabased.GreetingServiceImpl;

@Configuration
public class AppConfig {
	@Bean(name="gs1")
	public GreetingService getGs1(){
		GreetingServiceImpl gs = new GreetingServiceImpl();
		gs.setGreeting("Good Morning");
		return gs;
	}
	
	@Bean(name="gs2")
	public GreetingService getGs2(){
		GreetingServiceImpl gs = new GreetingServiceImpl("Good Afternoon");
		return gs;
	}
}
