package com.olehbilykh.Sorting.BubbleSort;

import java.util.Arrays;

/**
 * Bubble Sort is the simplest sorting algorithm that works
 * by repeatedly swapping the adjacent elements if they are
 * in the wrong order.
 * This algorithm is not suitable for large data sets as its
 * average and worst-case time complexity is quite high.
 * Time complexity - O(n^2)
 * stable
 */
public class Handler {
    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 14, -128, Integer.MAX_VALUE, 7, -3, 1};

        sortBubbles(arr);
    }

    public static void sortBubbles(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
