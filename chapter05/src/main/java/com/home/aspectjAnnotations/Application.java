package com.home.aspectjAnnotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

        assert (context != null);

        NewDocumentarist documentarist = context.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        System.in.read();

        context.close();
    }
}
