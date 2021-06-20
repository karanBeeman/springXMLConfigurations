package com.spring.core.xmlConfig;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "spend 30 mins on practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
