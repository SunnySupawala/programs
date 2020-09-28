package com.in.interview.test;

import java.util.HashMap;


class Employee{


    private String name;

    Employee(String name ){
        this.name = name;
    }

    public String getName() {
        return name;
    }

   @Override
    public int hashCode() {
       //System.out.println(super.hashCode());
       return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class Test {

    public static void main(String[] args) {
        HashMap<Employee, String> emp = new HashMap<>();
        emp.put(new Employee("a"), "emp1");
        emp.put(new Employee("a"), "emp updated");
        emp.put(new Employee("b"), "emp2");
        emp.put(new Employee("c"), "emp2");
        emp.put(new Employee("d"), "emp3");
        System.out.println(emp.size());
        System.out.println(emp.get(new Employee("a")));
        //System.out.println(emp.get("a"));

       // emp.entrySet().forEach(s -> System.out.println(s.getKey()));
    }
}
