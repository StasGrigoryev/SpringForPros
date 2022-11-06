package com.home;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MessageWrapper {

    private String prefix;
    private String suffix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    @Pointcut("execution(* com.home.MessageWriter.writeMessage(..))")
    public void doWriting() {}

    @Before("doWriting()")
    public void myBeforeAdvice(JoinPoint jp) {
        System.out.println(prefix);
    }

    @After("doWriting()")
    public void myAfterAdvice(JoinPoint jp) {
        System.out.println(suffix);
    }
}
