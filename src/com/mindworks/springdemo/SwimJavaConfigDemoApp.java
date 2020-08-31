package com.mindworks.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// "Test" class for SwimCoach Spring bean which is configured not in XML but purely in SportConfig.java class which is for configuring Beans for the application context
public class SwimJavaConfigDemoApp {
	
	
	public static void main(String[] args) {
		

//		read java config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//		retrive bean from the container
		Coach coach = context.getBean("swimCoach", Coach.class);

//		call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());

//		close the context
		context.close();
		
	}

}
