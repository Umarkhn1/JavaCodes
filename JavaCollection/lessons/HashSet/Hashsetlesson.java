package JavaCollection.lessons.HashSet;

import JavaCollection.lessons.linkedlist.Employee;

import java.util.*;

public class Hashsetlesson {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Lambo");
//        list.add("Ford");
//        list.add("Mustang");
//        HashSet<String> hashSet = new HashSet<>(list);
//        hashSet.add("BMW");
//        hashSet.add("Mercedes");
//        hashSet.add("Camaro");
//        hashSet.add("Camaro");
//
//
//        System.out.println(hashSet);

        HashSet<Employee> hashSet = new HashSet<>();

        Employee employee = new Employee("Tom",500,"programmer");
        Employee employee1 = new Employee("Umar",1000,"Senior");
        Employee employee2 = new Employee("Jerry",900,"Admin");
        hashSet.add(employee);
        hashSet.add(employee1);
        hashSet.add(employee2);

        hashSet.forEach(employees -> {
            System.out.println(employees.getName());
            System.out.println(employees.getZarplata());
            System.out.println(employees.getOrin());
        });

    }
}
