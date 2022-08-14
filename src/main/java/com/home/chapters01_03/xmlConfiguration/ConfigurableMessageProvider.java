package com.home.chapters01_03.xmlConfiguration;

public class ConfigurableMessageProvider implements MessageProvider {
    private String messageOne;
    private String messageTwo;

    public ConfigurableMessageProvider(String messageOne, String messageTwo) {
        this.messageOne = messageOne;
        this.messageTwo = messageTwo;
    }

    @Override
    public String getMessage() {
        return this.messageOne + " " + this.messageTwo;
    }
}
