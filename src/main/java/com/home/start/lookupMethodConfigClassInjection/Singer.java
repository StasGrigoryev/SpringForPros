package com.home.start.lookupMethodConfigClassInjection;

import org.springframework.stereotype.Component;

@Component("singer")
public class Singer {
    private String lyrics = "I played a quick game of chess "
            + "with the salt and pepper shaker";

    public void sing() {

    }
}
