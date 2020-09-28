package com.in.StringOperation;

import java.util.Arrays;
import java.util.function.Function;

public class TestToProject {

    public static void main(String[] args) {
        String s = "Error : Previous NCB Rate cannot be greater than 20";
        System.out.println("Test ==> "+getNCBPercent(s));

    }

    private static Integer getNCBPercent(String errText){
        Function<String, Integer> ncbPercent = s->Integer.valueOf(Arrays.asList(s.split("than")).get(1).trim());
        System.out.println("==>"+Arrays.asList(errText.split("than")).get(1).trim());
        return ncbPercent.apply(errText);
    }
}
