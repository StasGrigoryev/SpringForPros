package com.home.chapters01_03.lookupMethodInjection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapters01-03/lookup-method-context.xml");
        context.refresh();

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
