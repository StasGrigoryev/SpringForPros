package com.home.chapter04.profiles;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/profiles-*-context.xml");
        context.refresh();

        FoodProviderService foodProviderService = context.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for(Food food : lunchSet) {
            System.out.println("Food: " + food.getName());
        }

        context.close();
    }
}
