package com.in.dependency;

public class Company {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getHardDrive());
        DefineOne defineOne = new DefineSecond();
        defineOne.test();
    }
}
 class DefineOne{

    public String  test()
    {
        System.out.println("Returning DefineOne ");
        return "Returning DefineOne";

    }
}

class DefineSecond extends DefineOne{

    public String  test()
    {
        System.out.println("Returning DefineSecond ");
        return "Returning DefineSecond ";

    }
}