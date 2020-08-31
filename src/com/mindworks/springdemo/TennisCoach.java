package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// This class has been added to the application context as a Spring bean 
// using @Component annotation

// Explicitly defining the name or id of this Spring bean
//@Component("bestTennisCoach")

// Working with the default bean id which is in this case = tennisCoach 
//(default = the name of the class starting with small letter / lowercase)
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// In case of multiple implementation of an Interface, we are to use @Qualifier
	// to flag
//	Spring which specific Bean we would like to use
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: inside the default constructor");
	}

//	Syntax of qualifying args of a constructor is slightly different
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice the serving!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside the setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

//	We can use the @Autowired - annotation ( for dep. injection)  for any method, it can be
//	setter or whatever
//	@Autowired
//	public void doCrazyyy(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside the doCrazyyy() method");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

}
