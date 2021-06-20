package com.spring.core.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringapp {

    public static void main(String[] args) {

        // load the spring configuration File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        //when i try to call the getDialyFortune() it tries to call method definition from the BaseballCoach
        // because it is defined in the application context

        //close the context
        context.close();
    }
}


