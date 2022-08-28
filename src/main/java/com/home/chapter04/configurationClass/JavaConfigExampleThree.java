package com.home.chapter04.configurationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JavaConfigExampleThree {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/chapter04/mixed-config-context-2.xml");

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);
        mr.render();
    }
}
