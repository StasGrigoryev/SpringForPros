package com.home.chapter04.events;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        MessageEvent messageEvent = (MessageEvent) event;
        System.out.println("Received: " + messageEvent.getMessage());
    }
}
