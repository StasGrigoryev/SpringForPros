package com.home.start.methodReplacement;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/method-replacement-context.xml");
        context.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) context.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) context.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);

        context.close();
    }

    public static void displayInfo(ReplacementTarget replacementTarget) {

        System.out.println(replacementTarget.formatMessage("Thanks for playing, try again!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for (int x = 0; x < 1000000; x++) {
            String out = replacementTarget.formatMessage("No filter in my head");
//            System.out.println(out);
        }

        stopWatch.stop();

        System.out.println("1000000 invocations took: "
            + stopWatch.getTotalTimeMillis() + " ms");
    }
}
