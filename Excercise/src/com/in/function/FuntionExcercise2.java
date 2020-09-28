package com.in.function;

import java.util.function.Function;

public class FuntionExcercise2 {


    public static void main(String[] args) {

        Function<Integer, Integer> f1 = i -> i * 2;
        Function<Integer, Integer> f2 = i ->i * i * i ;

        //First f1 followed by f2
        System.out.println(f1.andThen(f2).apply(2)); // f1 will execute first f1 results will be the f2 input
        //First f2 followed by f1.
        //First f2 and then f1
        System.out.println(f1.compose(f2).apply(3));


    }
}
