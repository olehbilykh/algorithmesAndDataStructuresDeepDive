package com.olehbilykh.Algorithmes.Sorting.BucketSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Handler {
    public static void main(String[] args) {
        int[] arr = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(int[] arr) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (int k : arr) {
            buckets[hash(k)].add(k);
        }
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                arr[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
