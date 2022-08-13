package com.home.start.noSpringWithPropertiesFile;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World no Spring yet";
    }
}
