package com.home.chapter04.configurationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = "spring/chapter04/mixed-config-context.xml")
public class AppConfigFive {

    @Autowired
    MessageProvider provider;

    @Bean(name = "messageRenderer")
    public MessageRenderer messageRenderer() {
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(provider);
        return mr;
    }

}
