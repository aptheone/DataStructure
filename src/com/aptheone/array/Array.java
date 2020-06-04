package com.aptheone.array;

public class Array {
    int [] items=null;
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
}
