package com.home.start.destroyMethodInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

public class DestructiveBeanWithInterface implements InitializingBean, DisposableBean {

    private File file;
    private String filePath;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");

        if (filePath == null) {
            throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBeanWithInterface.class);
        }

        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean");

        if (!file.delete()) {
            System.out.println("ERROR: failed to delete file.");
        }

        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/destroy-method-with-interface.xml");
        context.refresh();

        DestructiveBeanWithInterface bean = (DestructiveBeanWithInterface) context.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        context.destroy();
        System.out.println("Called destroy()");
    }
}
