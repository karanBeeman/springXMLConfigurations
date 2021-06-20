package com.spring.core.xmlConfig;

public class MyappClass {

    public static void main(String[] args) {

       // BaseballCoach baseballCoach = new BaseballCoach();
        //baseballCoach.getDailyWorkout();
       Coach coach = new TrackCoach();
//        coach.getDailyWorkout();

       System.out.println(coach.getDailyWorkout());
    }
}
