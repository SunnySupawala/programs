package com.in.threadWait;

public class ThreadA extends Thread {

    Integer total = 1;
    @Override
    public void run() {

        synchronized (this)
        {
            for (int i=0 ; i <= 10; i++) {
                total = total + i;
                System.out.println("Enter into ThreadA");
            }
            this.notify();

        }

    }
}
