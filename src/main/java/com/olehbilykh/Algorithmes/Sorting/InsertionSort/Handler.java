package com.olehbilykh.Algorithmes.Sorting.InsertionSort;

import java.util.Arrays;

/**
 * Insertion sort is a simple sorting algorithm that works
 * similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part.
 * Values from the unsorted part are picked and placed at the correct
 * position in the sorted part.
 * Time complexity - O(n^2)
 * stable
 */
public class Handler {
    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 14, -128, Integer.MAX_VALUE, 7, -3, 1};
//        iterativeInsertionSort(arr);
        recursiveInsertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveInsertionSort(int[] arr, int n) {
//      Base case: if there is only one element in the array, it is already sorted
        if (n <= 1) {
            return;
        }
        // Sort the first n-1 elements recursively
        recursiveInsertionSort(arr, n - 1);
        // Insert the last element in its correct position in the sorted array
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }

    public static void iterativeInsertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length - 1; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
