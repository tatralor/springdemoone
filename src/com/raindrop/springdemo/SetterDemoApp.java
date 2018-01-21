package com.raindrop.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Andu on 21.01.2018.
 */
public class SetterDemoApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam()                                                                                             );

        //close context
        context.close();
    }
}
