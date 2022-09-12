package com.home.chapter05.staticPointcut;

import com.home.chapter05.beforeAdvice.Singer;

public class GoodGuitarist implements Singer {
    @Override
    public void sing() {
        System.out.println("Who says I can't be free \n"
                        + "From all of the things that I used to be");
    }
}
