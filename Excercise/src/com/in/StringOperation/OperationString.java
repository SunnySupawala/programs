package com.in.StringOperation;

import java.util.Arrays;

public class OperationString {


    public static void main(String[] args) {
        //String test = "User IDV should be in range (123.00, 456.00) this shoulb in range";


        //String[] split = test.split("[\\(\\)]");
       // String s2 = Arrays.asList(test.split("[\\(\\)]")).get(1).split(",")[1]; //Done Working
        //Double d = Double.valueOf(s2);
        //System.out.println("String ===> "+s2);
        String bajaj = "Idv entered should be in between Rs. 40137/- And Rs.49055/-";
        String test = Arrays.asList(bajaj.split("[\\.\\/]")).get(3);
        System.out.println("Bajaj ==> "+test);





    }
}
