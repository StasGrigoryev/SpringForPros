package com.home.afterAdviceKeyGenerator;

import org.springframework.aop.framework.ProxyFactory;

public class AfterAdviceDemo {

    private static KeyGenerator getKeyGenerator() {
        KeyGenerator target = new KeyGenerator();

        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new WeakKeyCheckAdvice());
        factory.setTarget(target);

        return (KeyGenerator) factory.getProxy();
    }

    public static void main(String[] args) {
        KeyGenerator keyGen = getKeyGenerator();

        for (int x = 0; x < 10; x++) {
            try {
                long key = keyGen.getKey();
                System.out.println("Key: " + key);
            } catch (SecurityException e) {
                System.out.println("Weak key generated!");
            }
        }
    }
}
