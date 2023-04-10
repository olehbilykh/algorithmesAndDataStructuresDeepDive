package com.olehbilykh.Algorithmes.Sorting.StableCountingSort;

import java.util.Arrays;

public class Handler {
    public static void sort(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = count[arr[i] - min] - 1;
            temp[index] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3, 4, 9, 2, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
