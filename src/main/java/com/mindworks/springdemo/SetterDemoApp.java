package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retriving CricketCoach objekt and calling setFortuneService , setEmailAddress
//		and setTeam one after the other -->
		CricketCoach coach2 = context.getBean("myCricketCoach", CricketCoach.class);

		
System.out.println("------------------");

//		call methods on the bean
		System.out.println(coach2.getDailyWorkout());

//		calling new method for fortune
		System.out.println(coach2.getDailyFortune());
//		calling getter method to check email address
		System.out.println(coach2.getTeam());
//		calling getter method to check email address
		System.out.println(coach2.getEmailAddress());

//		close the context
		context.close();

	}

}
