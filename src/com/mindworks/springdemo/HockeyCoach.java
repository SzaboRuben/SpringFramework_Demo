package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email.hockeyCoach}")
	private String email;
	
	@Value("${foo.team.hockeyCoach}")
	private String team;

	public HockeyCoach(FortuneService happyFortuneService) {
		this.fortuneService = happyFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Skate 50 circles in 10 minutes !";
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
