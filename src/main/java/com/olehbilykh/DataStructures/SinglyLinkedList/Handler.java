package com.olehbilykh.DataStructures.SinglyLinkedList;

public class Handler {
    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(new Employee("John4", "Doe", 4));
        list.addToFront(new Employee("John3", "Doe", 3));
        list.addToFront(new Employee("John2", "Doe", 2));
        list.addToFront(new Employee("John1", "Doe", 1));
        list.print();
        System.out.println();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        list.print();
        System.out.println(list.getSize());
    }
}