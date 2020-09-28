package com.in.CommonClass;


public class Student {

    String name ;
    Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getName()
    {
        return name;

    }
}
