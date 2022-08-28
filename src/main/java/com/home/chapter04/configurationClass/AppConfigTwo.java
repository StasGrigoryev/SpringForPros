package com.home.chapter04.configurationClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.home.chapter04.configurationClass")
public class AppConfigTwo {

    @Autowired
    MessageProvider provider;

    @Bean(name = "messageRenderer")
    public MessageRenderer messageRenderer() {
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(provider);
        return mr;
    }
}
