package com.home.aspectjAnnotations;

import com.home.aopProxyFactoryBean.Guitar;
import com.home.aopProxyFactoryBean.Singer;
import org.springframework.stereotype.Component;

@Component("johnMayer")
public class GrammyGuitarist implements Singer {
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
