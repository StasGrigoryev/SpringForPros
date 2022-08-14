package com.home.chapters01_03.xmlWithBeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("spring/chapters01-03/xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle) beanFactory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
