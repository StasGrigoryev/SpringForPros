package com.home.chapters01_03.annotations;

//@Component("provider")
public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World With Annotations";
    }
}
