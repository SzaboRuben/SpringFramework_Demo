package com.mindworks.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

//	Random fortunes in an array
	private String[] randomFortunes = {
		"Diligence is the mother of good luck",
		"The journey is the reward",
		"Beware of the wolf in sheep's clothing"	
	};
	
//	Random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(randomFortunes.length);
		return randomFortunes[index];
	}

}
