package com.home.start.annotations;

import org.springframework.stereotype.Component;

//@Component("provider")
public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World With Annotations";
    }
}
