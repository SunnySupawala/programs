package com.in.multithread;

public class MythreadSynchronizedMain {

    public static void main(String[] args) {
        Display d = new Display();
        MyThreadSynchronized t1 = new MyThreadSynchronized(d, "Kohli");
        MyThreadSynchronized s1 = new MyThreadSynchronized(d, "Sunny");
        MyThreadSynchronized s2 = new MyThreadSynchronized(d, "Mehul");
        MyThreadSynchronized s3 = new MyThreadSynchronized(d, "Jinal");
        MyThreadSynchronized s4 = new MyThreadSynchronized(d, "Maya");

        Thread t = new Thread(t1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s2);
        Thread t4 = new Thread(s3);
        t.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
