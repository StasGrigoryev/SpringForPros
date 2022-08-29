package com.home.chapter04.environment;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlaceHolderDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/env-application-context.xml");
        context.refresh();

        AppProperty appProperty = context.getBean("appProperty", AppProperty.class);

        System.out.println("application.home: " + appProperty.getApplicationHome());
        System.out.println("user.home: " + appProperty.getUserHome());

        context.close();
    }
}
