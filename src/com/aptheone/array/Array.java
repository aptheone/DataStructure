package com.aptheone.array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void reverse() {
        for (int i = count; i <=0; i--) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = items[0];
        // 1,11,0,10,7,2
        for (int i = 1; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }

    public int min() {
        int min = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] < min) {
                min = items[i];
            }
        }
        return min;
    }

    public int[] intersect(int[] items1, int[] items2) {
        int[] intersectArray;
        int count = 0;
        if (items1.length > items2.length) {
            intersectArray = new int[items2.length];
        } else {
            intersectArray = new int[items1.length];
        }
        for (int i = 0; i < items1.length; i++) {
            for (int j = 0; j < items2.length; j++) {
                if (items1[i] == items2[j]) {
                    intersectArray[count++] = items1[i];
                }
            }
        }
        return intersectArray;
    }

    public void intersect1(int[] items1, int[] items2) {
        int smallerArray, largerArray = 0;
        if (items1.length > items2.length) {
            smallerArray = items2.length;
            largerArray = items1.length;
        } else {
            smallerArray = items1.length;
            largerArray = items2.length;
        }

        for (int i = 0; i < smallerArray; i++) {
            for (int j = 0; j < largerArray; j++) {
                if (items1[i] == items2[j]) {
                    System.out.println(items1[i]);
                }
            }
        }
    }


    /*int [] items=null;
    int count=0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(items.length==count){
            int[] newArray = new int[count * 2];
            for(int i=0;i<count;i++){
                newArray[i]=items[i];
            }
            items=newArray;
        }
        items[count++]=item;
    }

    public void print(){
        for (int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }

    */
}
