package com.mindworks.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

//	new field for emailAddress
	private String emailAddress;
	private String team;

//	Constructor will be called from the app context (container) of Spring
	public CricketCoach() {
//		System.out.println("CricketCoach: inside no-arg constr");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
//		System.out.println("CricketCoach: inside setter setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
//		System.out.println("CricketCoach: inside setter setTeam()");
		this.team = team;
	}

	// Setter will injected through Spring. In the app context it is defined how.
	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("CricketCoach: inside setter setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket cracker wourkouuuuut !";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket to go ! --> " + fortuneService.getFortune();
	}

}
