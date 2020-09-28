package com.in;




class A
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
    void m2()
    {
        System.out.println("In m2 B");
    }
}
 class Test {

    public static void main(String[] args) {
       // A a=new B();
        //a.m1();

        Integer x = 10000 ;
        double y = x*5/100;
        System.out.println(y);

    }
}