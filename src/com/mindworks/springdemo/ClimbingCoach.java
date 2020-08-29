package com.mindworks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Climbing is the best ! Keep going, try the yellow route 7+";
	}
	
	

}
