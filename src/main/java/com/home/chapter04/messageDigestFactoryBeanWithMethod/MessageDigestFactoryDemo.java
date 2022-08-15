package com.home.chapter04.messageDigestFactoryBeanWithMethod;

import com.home.chapter04.messageDigestFactoryBean.MessageDigester;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/message-digest-factory-method-context.xml");
        context.refresh();

        MessageDigester digester = context.getBean("digester", MessageDigester.class);
        digester.digest("Hello World");
        context.close();
    }
}
