package com.home.chapters01_03.collectionXmlInjection;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private Map<String,Object> map;
    private Properties props;
    private Set set;
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapters01-03/collections-context.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();
        context.close();
    }

    public void displayInfo() {
        System.out.println("Map contents:\n");
        map.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("\nProperties contents:\n");
        props.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("\nSet contents:\n");
        set.forEach(o -> System.out.println("Value: " + o));
        System.out.println("\nList contents:\n");
        list.forEach(o -> System.out.println(" Value: " + o));

    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }
}
