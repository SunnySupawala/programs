package com.in.threadWait;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {


        ThreadA threadA = new ThreadA();
        threadA.start();
        synchronized (threadA)
        {
            System.out.println("Main Thread calls child thread");
            threadA.wait();

        }

        System.out.println(threadA.total);
        for (int i=0 ; i <= 10; i++) {
            System.out.println("Enter into Main Thread ");
        }
    }
}
