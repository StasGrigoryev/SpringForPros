package com.home.chapter05.aroundAdviceMethodExecTime;

public class WorkerBean {
    public void doSomeWork(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            work();
        }
    }

    private void work() {
        System.out.println("");
    }
}
