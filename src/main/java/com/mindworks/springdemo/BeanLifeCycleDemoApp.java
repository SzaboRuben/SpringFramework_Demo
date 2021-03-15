package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

//		load the Spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
//		retrive bean from Spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
//		After the constructor out init-method will be called (in our case: doMyStartupStuff)
		
//		Call a method on the object
		System.out.println(coach.getDailyWorkout());
		
//		close the context
//		before the context would close our destroy-method will be called
		context.close();
		
	}

}
