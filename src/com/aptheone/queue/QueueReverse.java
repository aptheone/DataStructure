package com.aptheone.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

    public static void main(String[] args) {

        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        System.out.println(integerQueue);
        System.out.println(reverse(integerQueue));
    }
    public static Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> integerStack = new Stack<>();
       //     System.out.println(queue.remove());
        while (!queue.isEmpty()) {
            integerStack.push(queue.remove());
        }
        while (!integerStack.isEmpty()){
            queue.add(integerStack.pop());
        }
        return queue;
    }
}