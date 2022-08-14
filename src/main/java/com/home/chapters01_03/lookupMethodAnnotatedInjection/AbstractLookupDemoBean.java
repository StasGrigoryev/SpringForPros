package com.home.chapters01_03.lookupMethodAnnotatedInjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBean")
public class AbstractLookupDemoBean implements DemoBean {

    @Lookup("singer")
    @Override
    public Singer getMySinger() {
        return null;
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
