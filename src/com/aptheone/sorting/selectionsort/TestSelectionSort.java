package com.aptheone.sorting.selectionsort;

public class TestSelectionSort {
    public static void main(String[] args) {
        int[] arrays = {2, 8, 4, 6, 1, 7, 9, 65, 0, 11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arrays);
        for (int num : arrays) {
            System.out.println(num);
        }
    }
}