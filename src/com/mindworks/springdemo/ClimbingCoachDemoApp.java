package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClimbingCoachDemoApp {

	public static void main(String[] args) {

//		Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		retrive bean from spring container
		ClimbingCoach coach = context.getBean("climbingCoach", ClimbingCoach.class);
//		if scope == singleton -> no other object will be instantiated. if scope = prototype -> a new object will be instantiated by every retrieval
		ClimbingCoach coach2 = context.getBean("climbingCoach", ClimbingCoach.class);

//		getting random fortunes, loaded from the sport.properties
		System.out.println(coach.getDailyFortune());

		System.out.println("--------------------");
		
//		If the scope of ClimbingCoach in the xml config file is set to singleton (or not set at all which means it is by default singleton)
//		then the Class will be instantiated only once in the App context (Spring's container). We will use the same object while the app's running.	
		
//		If the scope is set to "prototype" explicitly in the xml config file is every time we retrive this object, a new one will be instantiated
//		The following lines check whether the two objects are pointing to the same part of memory or not
		
		System.out.println("Memory reference for object 1 = " + coach);
		System.out.println("Memory reference for object 2 = " + coach2);
		
		System.out.println("Are the two objects the same ? Answer = " + (coach == coach2));
		
//		In order to call our own "destroy-method" we need to close our Application context. Note! : our own "destroy-method" will not be called if
//		the scope of the Spring bean is "prototype" . In that case further implementations are needed to call a specific overriden "destroy" method		
		
		context.close();
	}

}
