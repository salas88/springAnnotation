package com.vladislav.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	*/
	
	// define a default constructor
	public TennisCoach() {

	}
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

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
