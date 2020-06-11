package com.aptheone.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

   private int[] arrayQueue;
   private int count=0;
   private int front=0;
   private int rear=0;

    public ArrayQueue(int capacity) {
        arrayQueue = new int[capacity];
    }

    public void enqueue(int items){
        if (count==arrayQueue.length){
            throw new IllegalStateException();
        }
        arrayQueue[rear]=items;
        rear=(rear+1)%arrayQueue.length;
        count++;
    }

    public int dequeue(){
        if (arrayQueue.length==0){
            throw new NoSuchElementException();
        }
        int item=arrayQueue[front];
        arrayQueue[front]=0;
        front=(front+1)%arrayQueue.length;
        count--;
        return item;
    }

    public int peek(){
        if (arrayQueue.length==0){
            throw new NoSuchElementException();
        }
        int item=arrayQueue[front];
        arrayQueue[front]=0;
        front=(front+1)%arrayQueue.length;
        return item;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "arrayQueue=" + Arrays.toString(arrayQueue) +
                ", count=" + count +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
