package com.home.start.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String messageOne;
//    private String messageTwo;

    @Autowired
    public ConfigurableMessageProvider(String messageOne) {
        this.messageOne = messageOne;
//        this.messageTwo = messageTwo;
    }

    @Override
    public String getMessage() {
        return this.messageOne;
    }
}
