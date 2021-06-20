package com.spring.core.xmlConfig;

public class CricketCoach implements Coach {

    private String emailAddress;

    private String team;

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setter method of cricketCoach class");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "cricketCoach class with bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
