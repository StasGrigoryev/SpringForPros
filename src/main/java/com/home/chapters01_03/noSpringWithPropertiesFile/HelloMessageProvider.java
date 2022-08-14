package com.home.chapters01_03.noSpringWithPropertiesFile;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World no Spring yet";
    }
}
