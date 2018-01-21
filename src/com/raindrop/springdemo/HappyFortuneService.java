package com.raindrop.springdemo;

/**
 * Created by Andu on 20.01.2018.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
