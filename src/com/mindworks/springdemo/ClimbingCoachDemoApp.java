package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClimbingCoachDemoApp {

	public static void main(String[] args) {

//		Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		retrive bean from spring container
		ClimbingCoach coach = context.getBean("climbingCoach", ClimbingCoach.class);

//		getting random fortunes, loaded from the sport.properties
		System.out.println(coach.getDailyFortune());
	}

}
