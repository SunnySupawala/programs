package com.in;

class PracticeA {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9};
        mergeAray(a, b);

        int m = 0-0+1;
            System.out.println("Test " + m);


    }

    private static void  mergeAray(int[] x, int[] y ){
       // System.out.println(x.length);
        int z[] = new int[(x.length) + (y.length)];
        System.out.println("length" + z.length);
        int i = 0;
        for (i = 0; i < x.length; i++){
            z[i] = x[i];

        }
        int s = i;
        for (int j = 0; j < y.length ; j++){
            z[s +j] = y[j];
        }
        for (int h : z) {
            System.out.print(h);

        }



    }


}
