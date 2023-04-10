package com.olehbilykh.Algorithmes.Sorting.SelectionSort;

import java.util.Arrays;

/**
 * Selection sort is a simple and efficient sorting algorithm that works by repeatedly
 * selecting the smallest (or largest) element from the unsorted portion of the list
 * and moving it to the sorted portion of the list. The algorithm repeatedly selects
 * the smallest (or largest) element from the unsorted portion of the list and swaps
 * it with the first element of the unsorted portion. This process is repeated for the
 * remaining unsorted portion of the list until the entire list is sorted. One variation
 * of selection sort is called “Bidirectional selection sort” which goes through the list
 * of elements by alternating between the smallest and largest element, this way the algorithm can be faster in some cases.
 * The algorithm maintains two sub-arrays in a given array.
 * The subarray which already sorted.
 * The remaining subarray that was unsorted.
 * In every iteration of the selection sort, the minimum element (considering ascending order)
 * from the unsorted subarray is picked and moved to the beginning of the unsorted subarray.
 * After every iteration sorted subarray size increase by one and the unsorted subarray size decrease by one.
 * Time complexity - O(n^2)
 * unstable
 */
public class Handler {
    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 14, -128, Integer.MAX_VALUE, 7, -3, 1};

        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
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
