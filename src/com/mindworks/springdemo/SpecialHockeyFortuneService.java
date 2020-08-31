package com.mindworks.springdemo;

public class SpecialHockeyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your hockey team will surely win today!";
	}

}
