package com.home.aopProxyFactoryBean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ProxyFactoryBeanDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/aop-proxy-factory-bean-context.xml");
        context.refresh();

        Documentarist documentaristOne = context.getBean("documentaristOne", Documentarist.class);
        Documentarist documentaristTwo = context.getBean("documentaristTwo", Documentarist.class);

        System.out.println("DocumetaristOne >>");
        documentaristOne.execute();
        System.out.println("\nDocumetaristTwo >>");
        documentaristTwo.execute();
    }
}
