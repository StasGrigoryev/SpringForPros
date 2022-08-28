package com.home.chapter04.profiles.javaConfig;

import com.home.chapter04.profiles.Food;
import com.home.chapter04.profiles.FoodProviderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileJavaConfigExample {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(KindergartenConfig.class, HighschoolConfig.class);
        FoodProviderService foodProviderService = context.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for(Food food : lunchSet) {
            System.out.println("Food: " + food.getName());
        }

        context.close();
    }
}
