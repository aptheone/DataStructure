package com.aptheone.queue;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items;
    private int count = 0;

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (isFull()) {
            items =resizeArray();
        }
        int i = shiftItemToInsert(item);
        items[i] = item;
        count++;
    }

    private int[] resizeArray() {
        int[] newArray = new int[count * 2];
        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }
        return items = newArray;
    }

    private boolean isFull(){
        return count == items.length;
    }

    private int shiftItemToInsert(int item) {
        int i = 0;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return (i + 1);
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}