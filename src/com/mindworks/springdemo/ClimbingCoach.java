package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Climbing is the best ! Keep going, try the yellow route 7+";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
