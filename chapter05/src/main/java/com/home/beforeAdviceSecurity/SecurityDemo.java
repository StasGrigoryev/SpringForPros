package com.home.beforeAdviceSecurity;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityDemo {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();

        SecureBean bean = getSecureBean();

        securityManager.login("John", "pwd");
        bean.writeSecureMessage();
        securityManager.logout();

        try {
            securityManager.login("invalid user", "pwd");
            bean.writeSecureMessage();
        } catch(SecurityException e) {
            System.out.println("Exception caught " + e.getMessage());
        } finally {
            securityManager.logout();
        }

        try {
            bean.writeSecureMessage();
        } catch(SecurityException e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }

    private static SecureBean getSecureBean() {
        SecureBean target = new SecureBean();

        SecurityAdvice advice = new SecurityAdvice();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);

        SecureBean proxy = (SecureBean) factory.getProxy();

        return proxy;
    }
}
