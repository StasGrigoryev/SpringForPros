package com.home.chapters01_03.configurationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages =
//        {"com.home.start.annotations"})
//@ImportResource(locations =
//                    {"classpath:spring/chapters01-03/app-context-annotation.xml"})
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
