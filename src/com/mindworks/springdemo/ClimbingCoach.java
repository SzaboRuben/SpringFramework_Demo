package com.mindworks.springdemo;

public class ClimbingCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	public ClimbingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Climb 500 meters!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	
	
}
