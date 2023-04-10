package com.olehbilykh.DataStructures.Queue;

import java.util.LinkedList;

public class Handler {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);


        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(janeJones);
        arrayQueue.add(johnDoe);
        arrayQueue.add(marySmith);
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.printQueue();

        String s1 = "racecar";
        String s2 = "ababa";
        String s3 = "johnnhoj";

        System.out.println(checkForPalindrome(s1));
    }


    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
