package com.home.chapter04.configurationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigExampleTwo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigThree.class);

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);

        mr.render();
    }
}
