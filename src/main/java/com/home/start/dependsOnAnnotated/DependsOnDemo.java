package com.home.start.dependsOnAnnotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/depends-on-annotated-context.xml");
        context.refresh();

        Singer johnMayer = context.getBean("johnMayer", Singer.class);
        johnMayer.sing();

        context.close();
    }
}
