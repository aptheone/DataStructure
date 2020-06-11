package com.aptheone.sorting.bubblesort;

public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    private static void swap(int[] integer, int index1, int index2) {
        int temp = integer[index1];
        integer[index1] = integer[index2];
        integer[index2] = temp;
    }
}