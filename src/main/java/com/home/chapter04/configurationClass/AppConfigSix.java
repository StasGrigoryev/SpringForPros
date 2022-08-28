package com.home.chapter04.configurationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigSix {

    @Bean()
    public MessageProvider provider() {
        return new ConfigurableMessageProvider("Du hast mich gefragt and ich habt nicht gesagt");
    }
}
