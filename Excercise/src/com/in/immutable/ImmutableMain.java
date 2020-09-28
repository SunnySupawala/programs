package com.in.immutable;

public class ImmutableMain {

    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(16);
        age.setMonth(10);
        age.setYear(1994);

        ImmutableStudent student = new ImmutableStudent("Sunny", 10, age);
        System.out.println(student.getAge().getYear());
        age.setYear(1995);
        System.out.println(student.getAge().getYear());

    }
}
