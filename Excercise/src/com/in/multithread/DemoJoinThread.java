package com.in.multithread;

public class DemoJoinThread {


    public static void main(String[] args) throws InterruptedException {
        Runnable r = ()-> {
            for (int i =0 ; i <=10 ; i++)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Child tread Executes");
            }
        };
        Mythread.mt = Thread.currentThread();
        Mythread t1 = new Mythread();
        Thread t = new Thread(t1);
        t.start();
        t.join(10000);


        for (int i = 0 ; i <=10 ; i++)
        {
            System.out.println("Main tread Executes");
        }
    }
}
