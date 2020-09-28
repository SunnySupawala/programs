package com.in.interview;

public class Palintron {

    public static void main(String[] args) {
        String s1 = "MADAM";
        int check = 0 ;
        char[] arg = s1.toCharArray();
        int len = arg.length;
        char[] rev = new char[len];
        int j = len -1 ;
        for (int i = 0; i< len; i++){
            rev[i] = arg[j];
            j--;
        }

        for(int index = 0; index< len ; index++){
            if(arg[index]!= rev[index]){
                check = 1;
            }
        }

        if(check!= 0){
            System.out.println("No palindrome");
        }else {
            System.out.println("It is palindrome");
        }

    }
}
