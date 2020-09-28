package com.in.biFunction;

import com.in.CommonClass.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class biFunctionPractice {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        BiFunction<String, Integer, Student> s = (a,b)-> new Student(a,b);
        list.add(s.apply("Sunny", 01));
        list.add(s.apply("Sam", 02));
        list.add(s.apply("altamas", 031));
        list.add(s.apply("Hrishikesh", 04));
        list.forEach( student -> System.out.println(student.getName()));

        IntPredicate h = i-> i%2==0;
        System.out.println(h.test(12));
        //DoubleToIntFunction sw = s3->s3 % 2==0;
        //sw.applyAsInt(0.12);
        ToIntBiFunction<String, String> sf = (a,b)-> Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(sf.applyAsInt("3","4"));


        IntFunction<String> intFun = s1-> (String.valueOf(s1));
        intFun.apply(18);
        System.out.println("IntFuntion "+intFun.apply(18));
        IntToDoubleFunction sd = se -> se*2;
        System.out.println(sd.applyAsDouble(24));

    }
}
