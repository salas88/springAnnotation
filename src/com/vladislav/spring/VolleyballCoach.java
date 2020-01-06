package com.vladislav.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${a.email}")
	private String email;
	
	@Value("${a.team}")
	private String teamName;
	
	
	
	public String getEmail() {
		return email;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public VolleyballCoach() {}

	@Override
	public String getDailyWorkout() {
		
		return "Practice hand hit";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFurtune();
	}

}
