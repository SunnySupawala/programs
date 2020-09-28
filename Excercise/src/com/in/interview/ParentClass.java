package com.in.interview;


import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

class Test{

    public static void throwIt(){

    }

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");

        Enumeration<String> enumeration = Collections.enumeration(vector);
        while (enumeration.hasMoreElements()){
            //vector.add("3");
            System.out.println(enumeration.nextElement());
        }

        }

}


public class ParentClass {


    ParentClass(String x) {
        System.out.println("Parent class");
    }
    ParentClass() {
        System.out.println("Parent class 1");
    }

    public static void m1(String x){
        System.out.println("x");
    }
}
