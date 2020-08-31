package com.mindworks.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HockeyJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HockeyCoachConfig.class);
		
		Coach coach = context.getBean(HockeyCoach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());

		
		
	}

}
