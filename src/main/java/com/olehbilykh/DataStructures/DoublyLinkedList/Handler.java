package com.olehbilykh.DataStructures.DoublyLinkedList;

public class Handler {
    public static void main(String[] args) {

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(new Employee("John4", "Doe", 4));
        list.addToFront(new Employee("John3", "Doe", 3));
        list.addToFront(new Employee("John2", "Doe", 2));
        list.addToFront(new Employee("John1", "Doe", 1));
        list.addToEnd(new Employee("John5", "Doe", 5));
        list.print();
        System.out.println();
        System.out.println(list.getSize());
        list.print();

    }
}