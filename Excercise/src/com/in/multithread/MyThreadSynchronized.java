package com.in.multithread;

public class MyThreadSynchronized  extends  Thread{

    Display d ;
    String name;

    MyThreadSynchronized(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
