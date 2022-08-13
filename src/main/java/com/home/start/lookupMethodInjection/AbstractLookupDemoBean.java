package com.home.start.lookupMethodInjection;

public abstract class AbstractLookupDemoBean implements DemoBean {

    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
