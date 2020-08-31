package com.mindworks.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today your wishes come true!";
	}
	
	

}
