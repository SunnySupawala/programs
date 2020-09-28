package com.in.multithread;

public class Mythread implements Runnable {

    static Thread mt ;


    @Override
    public void run() {
        try {
        for (int i =0 ; i <=10 ; i++)
        {
           /* try {
                mt.join();
            } catch (InterruptedException e) {
            }*/

                Thread.sleep(2000);

            System.out.println("Child tread Executes");
        }

    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}}
