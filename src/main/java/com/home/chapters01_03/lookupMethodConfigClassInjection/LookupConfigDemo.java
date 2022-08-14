package com.home.chapters01_03.lookupMethodConfigClassInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupConfigDemo {

    @Configuration
    @ComponentScan(basePackages = "com.home.chapters01_03.lookupMethodConfigClassInjection")
    public static class LookupConfig {}

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(LookupConfig.class);

        DemoBean abstractBean = context.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = context.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        context.close();
    }

    public static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
        System.out.println("" + beanName + ": "
                    + "Singer instances the same? "
                    + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int x = 0; x < 10000; x++) {
            Singer singer = bean.getMySinger();
            singer.sing();
        }
        stopWatch.stop();
        System.out.println("100000 gets took "
                    + stopWatch.getTotalTimeMillis() + " ms");
    }
}
