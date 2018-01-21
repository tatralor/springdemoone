package com.raindrop.springdemo;

/**
 * Created by Andu on 20.01.2018.
 */
public class MyApp {

    public static void main(String[] args) {

        //create the object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
