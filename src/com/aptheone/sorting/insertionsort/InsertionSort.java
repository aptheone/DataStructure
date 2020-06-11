package com.aptheone.sorting.insertionsort;

public class InsertionSort {
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}

  /*for(int i=1;i<array.length;i++){
        int current=array[i];
        int index=i-1;
        for(int j=i-1;j>=0;j--){
        if(array[j]>current){
        array[j+1]=array[j];
        index=j;
        }
        }
        array[index]=current;
        }*/