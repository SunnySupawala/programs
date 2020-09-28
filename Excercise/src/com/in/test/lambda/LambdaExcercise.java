package com.in.test.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator
{
    String name ;
    int eno ;
    Employee()
    {

    }
    Employee(String name, int eno)
    {
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return eno+" ==> "+name;
    }

    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if(e1.eno < e2.eno )
        {
            return -1;
        }
        else if(e1.eno > e2.eno)
        {
            return +1;
        }
        else {
            return 0;
        }
    }
}

public class LambdaExcercise {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Sunny", 01));
        employeeList.add(new Employee("Samrath", 02));
        employeeList.add(new Employee("Jainesh", 03));
        employeeList.add(new Employee("Kais", 04));
        employeeList.add(new Employee("Altamas", 05));
        employeeList.add(new Employee("test", 06));
        Collections.sort(employeeList, (e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println(employeeList);

    }

    Runnable runnable = new Runnable() {
        public void run() {
            System.out.println();
        }
    };
}
