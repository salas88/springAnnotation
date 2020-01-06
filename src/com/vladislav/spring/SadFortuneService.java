package com.vladislav.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFurtune() {
		
		return "Today is a sad day";
	}

}
