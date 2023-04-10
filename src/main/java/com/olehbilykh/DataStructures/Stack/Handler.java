package com.olehbilykh.DataStructures.Stack;

import java.util.Stack;

public class Handler {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "ababa";
        String s3 = "johnnhoj";

        System.out.println(isStringPalindrome("abbvva"));
    }

    public static boolean isStringPalindrome(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (Character character : str.toCharArray()) {
            stack.push(character);
        }
        for (int i = 0; i < str.length(); i++) {

            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
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
