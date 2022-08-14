package com.home.chapters01_03.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextStart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/chapters01-03/app-context.xml");
        MessageRenderer mr = context.getBean("renderer", MessageRenderer.class);
        mr.render();

    }
}
