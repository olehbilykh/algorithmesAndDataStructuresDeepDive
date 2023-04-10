package com.olehbilykh.DataStructures.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class Handler {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "ababa";
        String s3 = "johnnhoj";

        System.out.println(checkForPalindrome("abbvva"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().contentEquals(stringNoPunctuation);
    }

    public static boolean isBalanced(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        // Traverse the string from left to right
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                // If the character is an opening parenthesis, push it onto the stack
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // If the character is a closing parenthesis, pop the top character from the stack and check if it is the corresponding opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // If all parentheses are balanced, return true; otherwise, return false
        return stack.isEmpty();
    }
}
