package com.spring.core.xmlConfig;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public  TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run for 5 km daily";
    }

    @Override
    public String getDailyFortune() {
        return "hello";
    }
}
