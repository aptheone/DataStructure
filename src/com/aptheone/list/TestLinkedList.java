package com.aptheone.list;

import java.util.Arrays;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.getMiddleNode();
        System.out.println(list.getKthNodeFromEnd(3));
     //   System.out.println(list.size());
        System.out.println("Initial "+ Arrays.toString(list.toArray()));
        list.reverseArray();
        System.out.println("Reverse "+Arrays.toString(list.toArray()));
      /*  System.out.println(list.indexOf(30));
        System.out.println(list.contains(40));
        list.removeFirst();*/
    }
}
