package com.olehbilykh.Algorithmes.Sorting.QuickSort;

import java.util.Arrays;

public class Handler {
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivotIndex = choosePivot(start, end);
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, end);
        int storeIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, end);
        return storeIndex;
    }

    private static int choosePivot(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 1, 3, 2, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
