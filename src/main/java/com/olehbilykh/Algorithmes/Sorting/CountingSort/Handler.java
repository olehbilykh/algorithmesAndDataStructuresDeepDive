package com.olehbilykh.Algorithmes.Sorting.CountingSort;

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
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3, 4, 9, 2, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
