package com.home.chapter05.beforeAdvice;

public class Guitarist implements Singer {
    private String lyrics = "You're gonna live forever in me";

    @Override
    public void sing() {
        System.out.println(lyrics);
    }
}
