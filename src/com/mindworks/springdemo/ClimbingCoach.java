package com.mindworks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "Climbing is the best ! Keep going, try the yellow route 7+";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
