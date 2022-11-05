package com.home.aspectjAnnotations;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJAnnotationDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/aspectj-annotated-context.xml");
        context.refresh();

        NewDocumentarist documentarist = context.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        context.close();
    }
}
