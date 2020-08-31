package com.mindworks.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
public class HockeyCoachConfig {

	@Bean
	public SpecialHockeyFortuneService specialHockeyFortuneService() {
		return new SpecialHockeyFortuneService();
	}

	@Bean
	public HockeyCoach hockeyCoach() {
		return new HockeyCoach(specialHockeyFortuneService());
	}

}
