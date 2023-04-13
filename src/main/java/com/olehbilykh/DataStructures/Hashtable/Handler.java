package com.olehbilykh.DataStructures.Hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Handler {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);

//        SimpleHashTable ht = new SimpleHashTable();
        ChainedHashtable ht = new ChainedHashtable();
        ht.put(janeJones.getSurname(), janeJones);
        ht.put(johnDoe.getSurname(), johnDoe);
        ht.put(marySmith.getSurname(), marySmith);
//        ht.printHashtable();
//        System.out.println(ht.get(johnDoe.getSurname()));
//        ht.remove(marySmith.getSurname());


        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
        for (int j : numsToAdd) {
            nums[hash(j)] = j;
        }

//        System.out.println(Arrays.toString(nums));
//
//        System.out.println(nums[hash(59382)]);

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<String, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.putIfAbsent(employee.getSurname(), employee);
        }
        employees.clear();
        employees.addAll(map.values());

        employees.forEach(System.out::println);

    }

    public static int hash(int value) {
        return Math.abs(value) % 10;
    }
}
