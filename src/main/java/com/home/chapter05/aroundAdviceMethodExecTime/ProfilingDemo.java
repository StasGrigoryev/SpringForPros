package com.home.chapter05.aroundAdviceMethodExecTime;

import org.springframework.aop.framework.ProxyFactory;

public class ProfilingDemo {
    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(10000000);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();

        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new ProfilingInterceptor());
        factory.setTarget(target);

        return (WorkerBean) factory.getProxy();
    }
}
