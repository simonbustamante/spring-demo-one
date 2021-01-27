package com.bustamante.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	//private RandomFortuneService randomFortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

	/*@Override
	public String getRandomFortune() {
		
		return "The Random Fortune: "+randomFortuneService.getFortune();
	}*/
	
	//adding init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside the method doMyStartupStuff");
	}
	
	//adding destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside the method doMyCleanupStuffYoYo");
	}

}