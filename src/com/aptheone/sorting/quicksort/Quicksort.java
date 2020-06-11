package com.aptheone.sorting.quicksort;

public class Quicksort {
    public void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        //partition
        int boundary = partition(array, start, end);
        //sort left
        sort(array, start, boundary - 1);
        //sort right
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, ++boundary);
            }
        }
        return boundary;
    }
    //7 4 3 2 1 5
    private void swap(int[] array, int i, int b) {
        int temp = array[i];
        array[i] = array[b];
        array[b] = temp;
    }
}
