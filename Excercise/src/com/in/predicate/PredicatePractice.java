package com.in.predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        //Predicate Function.
        Predicate<Employee> p1 = e -> e.salary < 50000 ;
        Predicate<Employee> p2 = employee -> employee.salary > 12000;

        List<Employee> employeList = new ArrayList<>();
        employeList.add(new Employee("Sunny" ,  01, 15000));
        employeList.add(new Employee("Altmas" ,  02, 75000));
        employeList.add(new Employee("deepak" ,  03, 49000));
        employeList.add(new Employee("Sunny" ,  04, 15000));
        employeList.add(new Employee("Sunny" ,  05, 15000));

        for (Employee employee : employeList)
        {
            if(p1.and(p2).test(employee))
            {
                System.out.println(employee);
            }
        }



    }


}
