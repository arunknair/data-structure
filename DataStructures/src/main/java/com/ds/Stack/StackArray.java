package com.ds.Stack;

public class StackArray<T> {
    private T[] arr;
    private int size=0;
    private int capacity;
    private int head = -1;

    public StackArray() {
        this(5);
    }

    public StackArray(int capacity) {
        arr = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void push(T item) {
        if(size + 1 > capacity) {
            capacity = capacity*2;
            T[] newArr = (T[])new Object[capacity];
            for(int i=0;i<size;i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        size++;
        arr[++head] = item;
    }

    public T pop() {
        if(head == -1) {
            throw new IllegalArgumentException();
        }
        size--;
        return arr[head--];
    }

    public String disp() {
        StringBuilder sb = new StringBuilder();
        int ptr = head;
        for(int i=size-1;i>=0;i--) {
            sb.append("| " + arr[i] + " |" + "\n" );
        }
        sb.append("----" + "\n");
        return sb.toString();
    }
}
