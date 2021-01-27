package com.bustamante.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	//new fields
	private String emailAddress;
	private String team;
	//random fortune service
	private RandomFortuneService randomFortuneService;
	
	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}
	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.out.println("CricketCoach: inside of setter method -setRandomFortuneService");
		this.randomFortuneService = randomFortuneService;
	}
	
	
	//generate with source on eclipse
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside of setter method -setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside of setter method -setTeam");
		this.team = team;
	}
	//no args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no args constructor");
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	//setter created by eclipse
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside of setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	/**@Override
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}*/

}
