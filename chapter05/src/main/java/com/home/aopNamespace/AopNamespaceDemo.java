package com.home.aopNamespace;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopNamespaceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/aop-namespace-context-3.xml");
        context.refresh();

        NewDocumentarist documentarist = context.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        context.close();
    }
}
