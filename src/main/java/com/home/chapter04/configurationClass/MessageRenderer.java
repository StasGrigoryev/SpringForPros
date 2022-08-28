package com.home.chapter04.configurationClass;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
