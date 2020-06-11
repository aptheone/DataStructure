package com.aptheone.queue;

public class TestArrayQueue {

    public static void main(String[] args) {
        ArrayQueue arrayQueue= new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        System.out.println(arrayQueue);
        System.out.println(arrayQueue.dequeue());
    }
}
