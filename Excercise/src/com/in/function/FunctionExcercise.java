package com.in.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExcercise {


    public static void main(String[] args) {

        Function<String, Integer> function = s ->s.length();
        System.out.println("Sunny length() ==> "+ function.apply("Sunny"));


        Function<Student, String> fs = s-> {
            Integer markks = s.marks;
            String grade ="";
            if(markks >= 80) System.out.println(grade ="Strudent grade: A");
            else if(markks >= 60) System.out.println(grade ="B");
            else if(markks >= 50) System.out.println(grade ="C");
            else if(markks >= 40) System.out.println(grade ="D");
            else System.out.println(grade ="Failed");
            return grade;

        };
        Predicate<Integer> p = i-> i>60;

        Student[] students ={
                new Student("Sunny", 90),
                new Student("Jinal", 60),
                new Student("Jinal", 50),
                new Student("Jinal", 40),
                new Student("Jinal", 35),
        };

        Consumer<Student> cs = student -> {
            System.out.println("Student name " + student.name);
            System.out.println("Student details " + fs.apply(student));

        };

        for (Student s : students)
        {
            if(p.test(s.marks)) {

                cs.accept(s);
            }
        }
    }
}
