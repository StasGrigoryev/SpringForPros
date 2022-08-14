package com.home.chapters01_03.configurationClass;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World with configuration class";
    }
}
