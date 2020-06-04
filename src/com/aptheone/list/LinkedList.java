package com.aptheone.list;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            size++;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    //10 20 30 40 50 60 70 80 90
    //    *        *
    public int getMiddleNode() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node firstNode = first;
        Node secondNode = first;

        while (secondNode != last && secondNode.next != last) {
            secondNode = secondNode.next.next;
            firstNode = firstNode.next;
        }
        if (secondNode == last) {
            System.out.println(firstNode.value);
        } else {
            System.out.println(firstNode.value + "," + firstNode.next.value);
        }
        return firstNode.value;
    }

    public int getKthNodeFromEnd(int kthNode) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node firstNode = first;
        Node secondNode = first;
        for (int i = 0; i < kthNode - 1; i++) {
            secondNode = secondNode.next;
        }
        while (secondNode != last) {
            firstNode = first.next;
            secondNode = secondNode.next;
        }
        return firstNode.value;
    }

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //10 20 30 40
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            size--;
            return;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        Node previousNode = getPreviousNode(last);
        last = previousNode;
        last.next = null;
        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        Node current = first;
        int[] array = new int[size];
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    // 10->20->30->40
    // 10<-20<-30->40
    //  P   C  N
    public void reverseArray() {
        if (isEmpty()) {
            return;
        }
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    private Node getPreviousNode(Node node) {
        Node current = first;
        while (current.next != null) {
            if (current.next == last) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
/*
    public void reverse(){
     //10->20->30->40
        // p   c   n
        //10<-20 30->40
        //30->20->10
        //o/p: 40->30->20->10
        //10<-20 30->40
        Node currentNode=last;
        Node endNode=first;
        Node previousNode= getPreviousNode(currentNode);
        while (previousNode!=endNode){
            first=currentNode;
            first.next=previousNode;
            currentNode=previousNode;
        }
    }*/
/* public int[] toArray(){
        Node current=first;
        int [] array=new int[size];
        for (int i=0 ; i<size;i++){
            array[i]=current.value;
            current=current.next;
        }
        return  array;
    }*/
   /* public int size() {
        int count=0;
        Node current = first;
        if (isEmpty()) {
            return count;
        }
        while (current.next!=null){
            count++;
        }
        return count;
    }*/
