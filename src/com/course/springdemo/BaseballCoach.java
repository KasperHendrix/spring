package com.course.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Baseball training";
	}
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
