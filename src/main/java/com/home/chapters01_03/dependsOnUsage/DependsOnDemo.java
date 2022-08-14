package com.home.chapters01_03.dependsOnUsage;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapters01-03/depends-on-context.xml");
        context.refresh();

        Singer johnMayer = context.getBean("johnMayer", Singer.class);
        johnMayer.sing();

        context.close();
    }
}
