package com.aptheone.sorting.insertionsort;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] arrays = {2, 8, 4, 6, 1, 7, 9, 65, 0, 11};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arrays);
        for (int num : arrays) {
            System.out.println(num);
        }
    }
}