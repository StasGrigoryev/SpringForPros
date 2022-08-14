package com.home.chapters01_03.autowiringInterface;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {

    private Foo fooOne;
    private Foo fooTwo;
    private Foo fooThree;
    private Bar barOne;
    private Bar barTwo;

    public CTarget() {
        System.out.println("Target() called");
    }

    public CTarget(Foo foo) {
        System.out.println("Target(Foo foo) called");
    }

    public CTarget(Foo foo, BarImplOne bar) {
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
    public void setFooThree(Foo fooThree) {
        this.fooThree = fooThree;
        System.out.println("Property fooThree set");
    }

    public void setBarOne(Bar bar) {
        this.barOne = bar;
        System.out.println("Property barOne set");
    }
    public void setBarTwo(Bar bar) {
        this.barTwo = bar;
        System.out.println("Property barTwo set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapters01-03/autowiring-modes-context-02.xml");
        context.refresh();

        CTarget target = null;

        System.out.println("Using byType:\n");
        target = (CTarget) context.getBean("targetByType");

        context.close();
    }
}
