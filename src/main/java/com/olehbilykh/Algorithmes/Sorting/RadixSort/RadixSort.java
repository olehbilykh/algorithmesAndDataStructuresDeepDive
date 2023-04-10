package com.olehbilykh.Algorithmes.Sorting.RadixSort;

import java.util.Arrays;

public class RadixSort {
    public static void sort(String[] arr) {
        // Find the maximum length of a string in the array
        int maxLen = 0;
        for (String s : arr) {
            if (s.length() > maxLen) {
                maxLen = s.length();
            }
        }
        // Pad all strings with spaces to make them the same length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = padString(arr[i], maxLen);
        }
        // Sort the array using radix sort
        for (int i = maxLen - 1; i >= 0; i--) {
            countingSort(arr, i);
        }
        // Remove the padding spaces from the sorted strings
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
    }

    private static String padString(String s, int len) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < len) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void sort(int[] arr) {
        // Find the maximum value in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Perform counting sort on each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(String[] arr, int pos) {
        // Use counting sort to sort the array based on the character at position pos
        int[] counts = new int[256];
        String[] temp = new String[arr.length];
        for (String s : arr) {
            counts[s.charAt(pos)]++;
        }
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int c = arr[i].charAt(pos);
            temp[counts[c] - 1] = arr[i];
            counts[c]--;
        }
        // Copy the sorted array back into the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int[] count = new int[10];
        int[] output = new int[arr.length];
        // Count the number of occurrences of each digit
        for (int i = 0; i < arr.length; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        // Modify the count array to hold the ending index of each value in the output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // Place the elements in the output array in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        // Copy the output array back to the input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3, 4, 9, 2, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        String[] array = {"bbbcccedt" +
                "", "def", "ab", "de", "abcd", "a", "d"};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
