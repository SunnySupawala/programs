package com.in.interview;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(a.length);
        int sum = a.length -1 ;
        List<Integer[]> list = getPairOfSum(a,sum);
        list.stream().forEach(s-> System.out.println("["+s[0]+":"+s[1]+"]"));

    }


    private static List<Integer[]> getPairOfSum(int[] x , int sum){
        int[] xClone = x;
        List<Integer[]> listOfArray = new ArrayList<>();
        for (int s :xClone) {
            for (int c = 0; c <= xClone.length-1 ; c++){
                if(sum == xClone[c] + s){
                    Integer[] x1 ;
                    x1 = new Integer[]{xClone[c], s};
                    listOfArray.add(x1);
                }
            }
        }

        return listOfArray;
    }

}
