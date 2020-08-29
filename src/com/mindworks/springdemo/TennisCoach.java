package com.mindworks.springdemo;

import org.springframework.stereotype.Component;

@Component("bestTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice the serving!";
	}

}
