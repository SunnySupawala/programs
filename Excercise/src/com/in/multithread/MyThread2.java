package com.in.multithread;

public class MyThread2 extends Thread {

    Display d ;
    String name ;

    MyThread2(Display d , String name ) {
        this.d =d;
        this.name = name;
    }



    @Override
    public void run() {
        try {
        Thread.sleep(2000);
            d.display(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
