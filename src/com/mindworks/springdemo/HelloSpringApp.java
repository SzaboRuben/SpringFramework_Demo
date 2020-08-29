package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

//		Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		retrive bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);

//		call methods on the bean
		System.out.println(coach.getDailyWorkout());

//		calling new method for fortune
		System.out.println(coach.getDailyFortune());


//		close the context
		context.close();
	}

}
