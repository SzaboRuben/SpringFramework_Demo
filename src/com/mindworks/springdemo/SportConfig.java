package com.mindworks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration /** This annotation flags Spring that the Applitation context should be configured through this class */
//@ComponentScan("com.mindworks.springdemo") /** Scans every classes in the given package*/ 
@PropertySource("sport.properties") /** Setting the property file from which some values should be loaded */
public class SportConfig {
	
//	define bean for sad fortune service
	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	};
	
	
//	define bean for swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
