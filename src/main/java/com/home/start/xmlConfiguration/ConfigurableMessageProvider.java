package com.home.start.xmlConfiguration;

import com.home.start.xmlConfiguration.MessageProvider;

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
