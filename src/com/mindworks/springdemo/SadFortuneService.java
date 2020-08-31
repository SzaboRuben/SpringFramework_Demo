package com.mindworks.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {	
		return "Sad beyond imagination ! :( ";
	}

}
