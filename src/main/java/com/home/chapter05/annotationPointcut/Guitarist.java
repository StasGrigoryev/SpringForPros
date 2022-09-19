package com.home.chapter05.annotationPointcut;

public class Guitarist implements Singer {
    private String lyrics = "You're gonna live forever in me";

    @Override
    public void sing() {
        System.out.println(lyrics);
    }

    @AdviceRequired
    @Override
    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }
    @AdviceRequired
    @Override
    public void rest() {
        System.out.println("zzz");
    }
}
