package com.home.start.destroyMethodConfigClass;

import com.home.start.destroyMethodWithJSR250.DestructiveBeanWithJSR250;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

public class DestructiveBeanConfigDemo {

    @Configuration
    static class DestructiveBeanConfig {

        @Lazy
        @Bean(initMethod = "afterPropertiesSet",
              destroyMethod = "destroy")
        DestructiveBeanWithJSR250 destructiveBean() {
            DestructiveBeanWithJSR250 destructiveBean = new DestructiveBeanWithJSR250();
            destructiveBean.setFilePath(
                            System.getProperty("java.io.tmpdir") +
                            System.getProperty("file.separator") +
                            "test.txt");
            return destructiveBean;
        }

        public static void main(String[] args) {
            GenericApplicationContext context = new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);
            context.getBean(DestructiveBeanWithJSR250.class);
            System.out.println("Calling destroy()");
            context.registerShutdownHook();
            System.out.println("Called destroy()");
        }

    }
}
