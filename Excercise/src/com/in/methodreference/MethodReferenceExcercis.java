package com.in.methodreference;

import java.util.function.Consumer;

public class MethodReferenceExcercis {

    public static void  test()
    {
        Consumer<String> cs = s-> System.out.println("Sunny Test ");
        cs.accept("'ewewew");
    }


    public static void main(String[] args) {
        Runnable r  = MethodReferenceExcercis::test;
        Thread t = new Thread(r);
        t.start();
    }

}
