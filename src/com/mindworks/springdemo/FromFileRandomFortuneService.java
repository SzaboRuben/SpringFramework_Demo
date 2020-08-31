package com.mindworks.springdemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FromFileRandomFortuneService implements FortuneService {

	private String fortunes[];

	private Random random;
	
	

	public FromFileRandomFortuneService() {
		System.out.println(">> FromFileRandomFortuneService: inside default constructor");
	}

	@Override
	public String getFortune() {
		random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

//	Implementing the import needs to be carried out right after instantiating an Object
//	Achieving this with @PostConstruct annotation
	@PostConstruct
	public void readFortunesFromFile() {
		System.out.println(">> FromFileRandomFortuneService : inside readFortunesFromFile() method" );
		String fileName = "fortunes.txt";
		ClassLoader classLoader = getClass().getClassLoader();

		File file = new File(classLoader.getResource(fileName).getFile());

		String fortunes = null;
		try {
			fortunes = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.fortunes = fortunes.split(",");
	}

}
