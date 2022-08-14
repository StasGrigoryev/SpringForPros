package com.home.chapter04.initMethod;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Singer {
    public static final String DEFAULT_NAME = "Eric Clapton";

    private  String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() {
        System.out.println("Initializing bean");

        if (name == null) {
            name = DEFAULT_NAME;
        }

        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(
                    "You must set the age property of any beans of type"
                    + Singer.class);
        }
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:init-method-context.xml");
        context.refresh();

        getBean("singerOne", context);
        getBean("singerTwo", context);
        getBean("singerThree", context);

        context.close();
    }

    public static Singer getBean(String beanName, ApplicationContext context) {

        try {
            Singer bean = (Singer) context.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("An error occurred in bean configuration: " + e.getMessage());
            return null;
        }
    }
}
