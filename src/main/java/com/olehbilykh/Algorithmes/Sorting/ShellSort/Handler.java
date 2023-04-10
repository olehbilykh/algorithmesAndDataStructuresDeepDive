package com.olehbilykh.Algorithmes.Sorting.ShellSort;

/**
 * Shell sort is a sorting algorithm that is an extension of the insertion sort algorithm.
 * O(n^2)
 */
public class Handler {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Do a gapped insertion sort for this gap size.
            for (int i = gap; i < n; i++) {

                // Add arr[i] to the elements that have been gap sorted
                int temp = arr[i];

                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Put arr[i] in its correct location
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        shellSort(arr);

        System.out.println("Array after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
