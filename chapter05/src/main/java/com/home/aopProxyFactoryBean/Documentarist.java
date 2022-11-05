package com.home.aopProxyFactoryBean;

public class Documentarist {

    public GrammyGuitarist guitarist;

    public void execute() {
        guitarist.sing();
        guitarist.talk();
    }

    public void setGuitarist(GrammyGuitarist guitarist) {
        this.guitarist = guitarist;
    }
}
