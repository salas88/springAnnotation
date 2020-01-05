package com.vladislav.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"Not Bad", "So-So", "perfect"
	};
	
	private Random random = new Random();
	
	
	@Override
	public String getFurtune() {
		
		int result = random.nextInt(fortunes.length);
		
		return "Today is your " + fortunes[result] + " day";
	}

}
