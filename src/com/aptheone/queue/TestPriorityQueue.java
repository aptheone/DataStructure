package com.aptheone.queue;

public class TestPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(3);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(4);
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
