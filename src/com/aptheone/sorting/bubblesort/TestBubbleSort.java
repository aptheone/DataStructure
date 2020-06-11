package com.aptheone.sorting.bubblesort;

public class TestBubbleSort {

    public static void main(String[] args) {
        int[] arrays = {2, 8, 4, 6, 1, 7, 9, 65, 0, 11};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrays);
        for (int num : arrays) {
            System.out.println(num);
        }
    }
}
