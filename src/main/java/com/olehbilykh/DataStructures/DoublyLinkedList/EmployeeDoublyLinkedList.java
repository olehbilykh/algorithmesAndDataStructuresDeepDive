package com.olehbilykh.DataStructures.DoublyLinkedList;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(this.head);

        if (isEmpty()) {
            tail = employeeNode;
        } else {
            head.setPrevious(employeeNode);
            employeeNode.setNext(head);
        }

        head = employeeNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);

        if (isEmpty()) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail = employeeNode;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;

        EmployeeNode toBeRemoved = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        toBeRemoved.setNext(null);
        return toBeRemoved;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty())
            return null;

        EmployeeNode toBeRemoved = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        toBeRemoved.setPrevious(null);
        return toBeRemoved;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.print("empty");
            return;
        }
        EmployeeNode current = head;
        System.out.print("null <- ");
        while (current != null) {
            System.out.print(current);
            if (current.getNext() != null)
                System.out.print(" <-> ");
            else
                System.out.print(" ->");
            current = current.getNext();
        }
        System.out.print(" null");
    }
}
