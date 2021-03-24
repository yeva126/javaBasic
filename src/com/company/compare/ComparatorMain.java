package com.company.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->a-b);
        //PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        queue.offer(9);
        queue.offer(6);
        queue.offer(3);
        queue.offer(2);
        queue.offer(7);
        System.out.println(Arrays.asList(queue));
    }
}
