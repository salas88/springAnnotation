package com.vladislav.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFurtune();
	}

}
