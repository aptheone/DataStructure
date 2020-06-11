package com.aptheone.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueue {

    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();

    //10 20 30 40
    public void enqueue(int item) {
        firstStack.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        moveFirstStackToSecondStack();
        return secondStack.pop();
    }

    public boolean isEmpty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        moveFirstStackToSecondStack();
        return secondStack.peek();
    }

    private void moveFirstStackToSecondStack() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }
}
