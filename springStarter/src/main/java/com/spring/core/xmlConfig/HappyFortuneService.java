package com.spring.core.xmlConfig;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your day";
    }
}
