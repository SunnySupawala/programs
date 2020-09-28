package com.in.multithread;

public class SlideRotator {

    public static void main(String[] args)  {
       /* for (int i = 0; i <10; i++)
        {
            System.out.println("Slide _"+i);
            Thread.sleep(5000);

        }*/
        System.out.println("Start of main thread");
        Mythread t = new Mythread();
        Thread th = new Thread(t);
        th.start();
        th.interrupt();
        System.out.println("End of main thread");

    }
}
