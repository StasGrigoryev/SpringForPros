package com.home.chapters01_03.lookupMethodInjection;

public class StandardLookupDemoBean implements DemoBean {
    private Singer mySinger;

    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public Singer getMySinger() {
        return mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
