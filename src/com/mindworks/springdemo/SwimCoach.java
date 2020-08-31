package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email2}")
	private String email;
	@Value("${foo.team2}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 2000 meters!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getTeam() {
		return team;
	}

}
