package com.mindworks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String args[]) {

		
//		load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrive the bean from spring container
		Coach theCoach =context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		System.out.println(theCoach == alphaCoach);
		
		context.close();
		
	}
	

}
