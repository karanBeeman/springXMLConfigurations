package com.spring.core.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoapp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = context.getBean("mycricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
    }
}
