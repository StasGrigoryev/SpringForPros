package com.home.aopNamespace;

import com.home.aopProxyFactoryBean.Guitar;
import org.aspectj.lang.JoinPoint;

public class SimpleAdvice {
    public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
        if (value.getBrand().equals("Gibson")) {
            System.out.println("Executing: " +
                    joinPoint.getSignature().getDeclaringTypeName() + " " +
                    joinPoint.getSignature().getName());
        }
    }
}
