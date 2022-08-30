package com.home.chapter04.JSR330Configuration;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Demo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/JSR330-config-context.xml");
        context.refresh();

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);
        mr.render();

        context.close();
    }
}
