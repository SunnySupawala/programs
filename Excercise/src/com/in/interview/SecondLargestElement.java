package com.in.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {

    public static void main(String[] args) {
        Integer[] s1 = {1,2,3,4,5,6};
        System.out.println(secondLargestNumberCollection(s1, s1.length));
        System.out.println(secondLargestNumber(s1, s1.length));
    }


  private static int  secondLargestNumber(Integer[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }


    private static int secondLargestNumberCollection(Integer[] a, int total){
        List<Integer> list =Arrays.asList(a);
        Collections.sort(list);
        return list.get(total-2);

    }
}

