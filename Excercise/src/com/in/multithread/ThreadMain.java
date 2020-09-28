package com.in.multithread;

public class ThreadMain {


    public static void main(String[] args) {
        Display d = new Display();

        MyThread1 t1= new MyThread1(d, "Sunny");
        MyThread2 t2 = new MyThread2(d, "karan");
        t1.start();
        t2.start();

    }




}
