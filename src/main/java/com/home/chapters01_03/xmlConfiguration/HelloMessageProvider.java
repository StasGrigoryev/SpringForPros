package com.home.chapters01_03.xmlConfiguration;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World with XML configuration file";
    }
}
