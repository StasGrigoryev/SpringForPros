package com.home.chapters01_03.autowiringConfigurationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Component("gigi")
//@Lazy
public class TrickyTarget {

    Foo fooOne;
    Foo fooTwo;
    Bar bar;

    public TrickyTarget() {
        System.out.println("TrickyTarget() called");
    }

    public TrickyTarget(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("TrickyTarget(Foo fooOne) called");
    }

    public TrickyTarget(Foo fooOne, Bar bar) {
        System.out.println("TrickyTarget(Foo fooOne, Bar bar) called");
    }

    @Autowired
    @Qualifier("fooImplOne")
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }
    @Autowired
    @Qualifier("fooImplTwo")
    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

}
