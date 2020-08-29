package com.mindworks.springdemo;

import org.springframework.stereotype.Component;

// This class has been added to the application context as a Spring bean 
// using @Component annotation

// Explicitly defining the name or id of this Spring bean
//@Component("bestTennisCoach")

// Working with the default bean id which is in this case = tennisCoach 
//(default = the name of the class starting with small letter / lowercase)
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice the serving!";
	}

}
