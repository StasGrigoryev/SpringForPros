package com.home.aspectjExpressionPointcut;

public class Guitarist implements Singer {
    private String lyrics = "You're gonna live forever in me";

    @Override
    public void sing() {
        System.out.println(lyrics);
    }

    @Override
    public void sing2() {
        System.out.println("Oh gravity just stay the hell away from me");
    }

    @Override
    public void rest() {
        System.out.println("zzz");
    }
}
