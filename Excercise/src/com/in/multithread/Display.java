package com.in.multithread;

public class Display {

    public synchronized void  wish(String x) throws InterruptedException {
        for (int i = 0; i <=10 ; i++) {
            Thread.sleep(2000);
            System.out.println("Happy birthday :: " + x);
        }
    }
    public synchronized  void display(String y) throws InterruptedException{
        for (int i =0 ; i <=10 ; i++)
        {
            Thread.sleep(3000);
            System.out.println("Thread of display : "+ i);
        }
    }

}
