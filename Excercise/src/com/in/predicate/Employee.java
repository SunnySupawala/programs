package com.in.predicate;

public class Employee {

    String name;
    int eid;
    Integer salary;

    public Employee(String name, Integer eid, Integer salary) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name => "+ name +"Salary "+ salary;
    }
}
