package com.vladislav.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFurtune() {
		
		return "Today is your lucky day";
	}

	



}
