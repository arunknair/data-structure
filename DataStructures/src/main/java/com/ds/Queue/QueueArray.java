package com.ds.Queue;

public class QueueArray<T> {
    private T[] arr;
    private int front = -1;
    private int back = -1;

    public QueueArray() {
        this(5);
    }

    public QueueArray(int size) {
        arr = (T[]) new Object[size];
    }

    public void enqueue(T data) {
        if(back + 1 == arr.length) {
            System.out.println("Limit reached!!!");
            return;
        }
        if(front == -1) {
            front = back = 0;
        } else {
            back++;
        }
        arr[back] = data;
    }

    public void dequeue() {
        if(front == -1) {
            System.out.println("Empty!!!");
            return;
        }
        System.out.println("Removing item from Queue : " + arr[front]);
        if(front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    public void disp() {
        if(front == -1) {
            System.out.println("Empty!!!");
            return;
        }
        for(int i = back; i >= front; i--) {
            System.out.print(arr[i] + " -> ");
        }
    }
}
