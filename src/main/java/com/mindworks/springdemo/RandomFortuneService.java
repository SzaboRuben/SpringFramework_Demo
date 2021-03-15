package com.mindworks.springdemo;

public class RandomFortuneService implements FortuneService {

	
	private String[] fortunes;
	
	
	public String[] getFortunes() {
		return fortunes;
	}


	public void setFortunes(String fortunes) {
		this.fortunes = fortunes.split(",");
	}


	@Override
	public String getFortune() {
		return fortunes[getRandomNumberBetween(0, 2)];
	}
	
	private int getRandomNumberBetween(int min, int max) {
        int range = max - min + 1; 
        return (int)(Math.random() * range) + min;
	}

}
