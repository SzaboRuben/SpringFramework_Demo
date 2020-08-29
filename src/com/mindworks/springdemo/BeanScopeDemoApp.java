package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
//		load the Spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
//		retrive bean from Spring container
		
		Coach coach = context.getBean("myCoach", Coach.class);

		Coach coach2 = context.getBean("myCoach", Coach.class);
		boolean a = coach == coach2;
		
//		Checking whether the  variables are pointing to the same area of the memory
//		(= to the same object created by Spring framework in the containter
//		[=which is in other name the Application context])
		
		System.out.println(a);
		System.out.println(coach);
		System.out.println(coach2);
		
		
	}

}
