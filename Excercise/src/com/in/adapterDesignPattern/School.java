package com.in.adapterDesignPattern;




interface I1
{
    String toString();
}

public class School {

    public static void main(String[] args) {

        byte a[] = { 65, 66, 67, 68, 69, 70 };
        byte b[] = { 71, 72, 73, 74, 75, 76 };
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.print(new String(a) + " " + new String(b));
    }
}
