package com.aptheone.sorting.quicksort;

import com.aptheone.sorting.selectionsort.SelectionSort;

public class TestQuickSort {
    public static void main(String[] args) {
        int[] arrays = {2, 8, 4, 6, 1, 7, 9, 65, 0, 11};
        Quicksort sort = new Quicksort();
        sort.quickSort(arrays);
        for (int num : arrays) {
            System.out.println(num);
        }
    }
}