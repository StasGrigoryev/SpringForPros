package com.home.start.configurationClass;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World with configuration class";
    }
}
