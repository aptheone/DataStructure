package com.aptheone.sorting.mergesort;

public class TestMergeSort {
    public static void main(String[] args) {
        int[] arrays = {2, 8, 4, 6, 1, 7, 9, 65, 0, 11};
        Mergesort mergesort = new Mergesort();
        mergesort.mergeSort(arrays);
        for (int num : arrays) {
            System.out.println(num);
        }
    }
}