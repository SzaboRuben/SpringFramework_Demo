package com.mindworks.springdemo;

public class ClimbingCoach implements Coach {

	private FortuneService fortuneService;

	public ClimbingCoach(FortuneService fortuneService) {
		System.out.println("Class 'ClimbingCoach' method 'constructor'");
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

	public void firstMethodToBeCalled() {
		System.out.println(
				"Class 'ClimbingCoach' method 'getDailyFortune' . This method will be called right after the constructor, before any other method");
	}

	public void lastMethod() {
		System.out.println(
				"Class 'ClimbingCoach' method 'lastMethod' . This method will be called right before closing the context"
						+ ", after all other methods");
	}

}
