package com.olehbilykh.DataStructures.DoublyLinkedList;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;

    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeNode that = (EmployeeNode) o;

        if (!employee.equals(that.employee)) return false;
        if (!next.equals(that.next)) return false;
        return previous.equals(that.previous);
    }

    @Override
    public int hashCode() {
        int result = employee.hashCode();
        result = 31 * result + next.hashCode();
        result = 31 * result + previous.hashCode();
        return result;
    }

    public String toString() {
        return employee.toString();
    }
}
