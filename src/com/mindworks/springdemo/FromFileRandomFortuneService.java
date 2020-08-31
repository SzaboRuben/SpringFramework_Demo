package com.mindworks.springdemo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FromFileRandomFortuneService implements FortuneService {

	private String fortunes[];

	private Random random;

	public FromFileRandomFortuneService() {
		fortunes = readFortunesFromFile("fortunes.txt");
	}

	@Override
	public String getFortune() {
		random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

	public String[] readFortunesFromFile(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();

		File file = new File(classLoader.getResource(fileName).getFile());

		String fortunes = null;
		try {
			fortunes = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fortunes.split(",");

	}

}
