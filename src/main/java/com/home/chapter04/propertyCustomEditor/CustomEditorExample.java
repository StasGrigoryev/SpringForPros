package com.home.chapter04.propertyCustomEditor;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomEditorExample {
    private FullName name;

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter04/property-custom-editor-context.xml");
        context.refresh();

        CustomEditorExample bean = (CustomEditorExample) context.getBean("exampleBean");
        System.out.println(bean.getName());

        context.close();
    }
}
