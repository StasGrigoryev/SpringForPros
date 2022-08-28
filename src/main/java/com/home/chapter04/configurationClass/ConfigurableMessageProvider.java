package com.home.chapter04.configurationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String messageOne;

    @Autowired
    public ConfigurableMessageProvider(@Value("Love on the weekend") String messageOne) {
        this.messageOne = messageOne;
    }

    @Override
    public String getMessage() {
        return this.messageOne;
    }
}
