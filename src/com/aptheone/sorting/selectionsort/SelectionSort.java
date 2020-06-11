package com.aptheone.sorting.selectionsort;

public class SelectionSort {
    public void sort(int[] array) {
        //5 , 3 , 1, 4 ,6
        for (int i = 0; i < array.length; i++) {
            int minIndex = getIndexOfMin(array, i);
            swap(array,minIndex,i);
        }
    }

    private int getIndexOfMin(int[] array, int i) {
        int minIndex = i;
        for (int j = i; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static void swap(int[] integer, int index1, int index2) {
        int temp = integer[index1];
        integer[index1] = integer[index2];
        integer[index2] = temp;
    }
}