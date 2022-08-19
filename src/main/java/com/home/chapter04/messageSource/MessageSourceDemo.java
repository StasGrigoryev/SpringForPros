package com.home.chapter04.messageSource;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;

public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/message-source-context.xml");
        context.refresh();

        Locale english = Locale.ENGLISH;
        Locale german = new Locale("de", "DE");

        System.out.println(context.getMessage("message", null, english));
        System.out.println(context.getMessage("message", null, german));
        System.out.println(context.getMessage("nameMessage", new Object[]{"John", "Mayer"}, english));
        System.out.println(context.getMessage("nameMessage", new Object[]{"John", "Mayer"}, german));

        context.close();
    }
}
