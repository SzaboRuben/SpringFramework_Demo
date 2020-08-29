package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
//		read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
//		retrive bean from the container
		Coach coach =  context.getBean("bestTennisCoach", Coach.class);
		
//		call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		
//		close the context
		context.close();
	}

}
