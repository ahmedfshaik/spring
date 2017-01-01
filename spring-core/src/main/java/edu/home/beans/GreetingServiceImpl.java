package edu.home.beans;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;

	public GreetingServiceImpl() {
		System.out.println("Default Constructor");
	}

	public GreetingServiceImpl(String greeting) {
		System.out.println("Parameter Constructor");
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayGreeting() {
		System.out.println("Hai " + greeting);
	}
}
