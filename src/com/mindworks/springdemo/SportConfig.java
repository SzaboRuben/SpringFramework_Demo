package com.mindworks.springdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configuration /** This annotation flags Spring that the Applitation context should be configured through this class */
@ComponentScan("com.mindworks.springdemo") /** Scans every classes in the given package*/ 
@PropertySource("sport.properties") /** Setting the property file from which some values should be loaded */
public class SportConfig {

}
