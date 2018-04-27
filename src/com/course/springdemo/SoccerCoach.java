package com.course.springdemo;

public class SoccerCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Soccer Training";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
