package com.in.test.lambda;

interface interLeft
{
    default  void m1()
    {
        System.out.println("default left m1 ");
    }
}
interface interRight
{
    static void m2()
    {
        System.out.println("djkbbsdcjhsbdcjhsbd");
    }
    default  void m1()
    {
        System.out.println("default Right m1 ");
    }
}

public class DefaultMethod implements interLeft, interRight
{
    public void m1()
    {
        //interLeft.super.m1();
        interRight.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.m1();

    }

}
