package com.home.chapters01_03.noSpringWithPropertiesFile;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
