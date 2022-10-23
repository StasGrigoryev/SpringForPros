package com.home.staticPointcut;

import com.home.beforeAdvice.Singer;

public class GreatGuitarist implements Singer {
    @Override
    public void sing() {
        System.out.println("I shot the sheriff, \n"
                    + "But I did not shoot the deputy");
    }
}
