package com.olehbilykh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzbuzz(5)));
        System.out.println(Arrays.toString(fizzbuzz(3)));
        System.out.println(Arrays.toString(fizzbuzz(15)));
        System.out.println(Arrays.toString(fizzbuzz(1)));
    }


    // 3 fizz 5 buzz 3&5 fizzbuzz else exception
    public static byte[] fizzbuzz(int value) {
        if (value % 5 == 0 && value % 3 == 0) {
            System.out.println("fizzbuzz");
            return "fizzbuzz".getBytes();
        } else if (value % 3 == 0) {
            System.out.println("fizz");
            return "fizz".getBytes();
        } else if (value % 5 == 0) {
            System.out.println("buzz");
            return "buzz".getBytes();
        }

        throw new IllegalArgumentException();
    }
}