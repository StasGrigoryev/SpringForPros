package com.home;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:aspectj-context.xml");
        context.refresh();

        MessageWriter writer = context.getBean("writer", MessageWriter.class);
        writer.writeMessage();
        writer.foo();
    }
}