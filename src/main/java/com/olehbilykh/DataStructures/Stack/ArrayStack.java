package com.olehbilykh.DataStructures.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // need to resize backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        System.out.println(Arrays.toString(stack));
    }
}
