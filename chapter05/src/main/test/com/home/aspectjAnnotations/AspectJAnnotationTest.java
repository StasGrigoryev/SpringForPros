package com.home.aspectjAnnotations;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJAnnotationTest {
    @Test
    public void xmlTest() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/aspectj-annotated-context.xml");
        ctx.refresh();

        NewDocumentarist documentarist = ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        ctx.close();
    }

    @Test
    public void configTest() {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        NewDocumentarist documentarist = ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();

        ctx.close();
    }
}
