package com.olehbilykh.Algorithmes.Search.BinarySearch;

public class Handler {
    public static void main(String[] args) {
        int[] arr = {-22, 15, 1, 7, 20, 35, 55};
        System.out.println(iterativeBinarySearch(arr, 1));
        System.out.println(recursiveBinarySearch(arr, 35));
    }

    public static int iterativeBinarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length;
        int midpoint;
        while (start < end) {
            midpoint = (start + end) / 2;
            if (array[midpoint] == value) {
                return midpoint;
            } else if (array[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int value) {
        return recursiveBinarySearch(array, 0, array.length, value);
    }

    private static int recursiveBinarySearch(int[] array, int start, int end, int value) {
        if (start >= end)
            return -1;
        int midpoint = (start + end) / 2;

        if (array[midpoint] == value) {
            return midpoint;
        } else if (array[midpoint] < value) {
            return recursiveBinarySearch(array, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(array, start, midpoint, value);
        }
    }


}
