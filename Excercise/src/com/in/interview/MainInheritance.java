package com.in.interview;

public class MainInheritance {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        Subclass subclass = new Subclass();
        ParentClass parentClass12 = new ParentClass();
        if(parentClass == parentClass12){
            System.out.println("1");
        }
        if(parentClass.equals(parentClass12)){
            System.out.println("2");
            System.out.println(parentClass.hashCode());
        }
        ParentClass parentClass123 = new Subclass();
        parentClass123.m1("Suuny");
    }
}
