package com.home.chapters01_03.annotations;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapters01-03/app-context-annotation.xml");
        context.refresh();
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
        context.close();
    }
}
