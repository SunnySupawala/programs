package com.in.mergesort;

public class MergeSortBaelding {


    public static void mergeSort(int a[], int n){
        if(n< 2){
            return;
        }
        int mid = n/2 ;
        int L[] = new int[mid];
        int R[] = new int[n - mid ];

        for (int i = 0 ; i < mid; i++){
            L[i] = a[i];
        }
        for (int i  = mid ; i < n  ; i++  ){
            R[i - mid] = a[i];
        }
        mergeSort(L, mid);
        mergeSort(R, n- mid);

        merge(a, L, R, mid, n - mid);


     }


     public static void merge(int a[], int L[], int R[], int left, int right){
        int i = 0, j =0 , k = 0;
        while (i < left && j < right){
            if(L[i] <= a[i]){
               a[k++] = L[i++];
            }else
                a[k++] = R[j++];
        }
        while (i < left){
            a[k++] = L[i++];
        }
        while (j < right){
            a[k++] = R[j++];
        }
        

     }


    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        mergeSort(actual, actual.length);
        for (int act : actual){
            System.out.print(act);
        }
    }






}
