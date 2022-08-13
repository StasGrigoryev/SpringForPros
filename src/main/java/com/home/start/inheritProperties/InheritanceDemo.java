package com.home.start.inheritProperties;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InheritanceDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/inheritance-of-properties.xml");
        context.refresh();

        Singer parent = (Singer) context.getBean("parent");
        Singer child = (Singer) context.getBean("child");

        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
    }
}
