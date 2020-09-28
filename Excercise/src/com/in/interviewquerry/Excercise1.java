package com.in.interviewquerry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Excercise1 {

    public static void main(String[] args) {
        Object i = new ArrayList<>().iterator();
        System.out.print((i instanceof List)+",");// false
        System.out.print((i instanceof Iterator)+",");// true
        System.out.println(i instanceof ListIterator);// false


        System.out.println(new L1() {
            @Override
            public String toString() {
                System.out.print("Example");
                return("A");
            }
        });
    }
}
