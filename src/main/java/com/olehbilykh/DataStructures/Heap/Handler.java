package com.olehbilykh.DataStructures.Heap;

import java.util.PriorityQueue;

public class Handler {
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
        System.out.println(heap);

        heap.delete(1);
        System.out.println(heap);
        System.out.println("root " + heap.peek());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(45);
        pq.add(-3467);
        pq.add(5234);
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
