package com.in.bipredicate;

import java.util.function.BiPredicate;

public class BipredicateFunction {


    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a,b)->(a+b) % 2==0;

        System.out.println(bp.test(5,10));
        System.out.println(bp.negate());
        System.out.println(bp.test(20,10));
        System.out.println(bp.test(50,10));
    }
}
