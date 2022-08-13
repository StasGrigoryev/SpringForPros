package com.home.start.autowiring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {

    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public Target() {
        System.out.println("Target() called");
    }

    public Target(Foo foo) {
        System.out.println("Target(Foo foo) called");
    }

    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo foo, Bar bar) called");
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/autowiring-modes-context-01.xml");
        context.refresh();

        Target target = null;

        System.out.println("Using byName:\n");
        target = (Target) context.getBean("targetByName");

        System.out.println("\nUsing byType:\n");
        target = (Target) context.getBean("targetByType");

        System.out.println("\nUsing constructor:\n");
        target = (Target) context.getBean("targetConstructor");

        context.close();
    }
}
