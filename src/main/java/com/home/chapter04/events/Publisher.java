package com.home.chapter04.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Publisher implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void publish(String message) {
        context.publishEvent(new MessageEvent(this, message));
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/chapter04/events-context.xml");

        Publisher publisher = (Publisher) context.getBean("publisher");
        publisher.publish("I send SOS to the world...");
        publisher.publish("I hope that someone gets my ...");
        publisher.publish("... Message in a bottle");
    }
}
