package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClimbingCoach implements Coach {

//	Initializing attributes using values from "sport.properties"
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
//	Instantiatig an implementation of Fortuneservice with Spring
	@Autowired
	@Qualifier("fromFileRandomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Climbing is the best ! Keep going, try the yellow route 7+";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	


}
