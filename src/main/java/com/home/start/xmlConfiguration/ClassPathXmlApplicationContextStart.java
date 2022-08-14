package com.home.start.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextStart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/start/app-context.xml");
        MessageRenderer mr = context.getBean("renderer", MessageRenderer.class);
        mr.render();

    }
}
