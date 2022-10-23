package com.home.aopProxyFactoryBean;

public class GrammyGuitarist  {
    public void sing() {
        System.out.println("Gravity is working against me\n " +
                                "And gravity wants to bring me down.");
    }

    public void sing(Guitar guitar) {
        System.out.println("Playing: " + guitar.play());
    }

    public void rest() {
        System.out.println("Zzz...");
    }

    public void talk() {
        System.out.println("Talking...");
    }
}
