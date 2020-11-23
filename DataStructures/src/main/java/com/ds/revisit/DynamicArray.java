package com.ds.revisit;

public class DynamicArray<T> {
    private T[] arr;
    private int len;
    private int capacity;

    public DynamicArray() {
        this(5);
    }
    public DynamicArray(int size) {
        if(size < 0) {
            throw new IllegalArgumentException();
        }
        this.arr = (T[]) new Object[size];
        this.capacity = size;
        len = 0;
    }
    public int size() {
        return arr.length;
    }

    public void addItem(T item) {
        if(capacity == 0) {
            capacity = 1;
        } else if(len+1 > capacity) {
            capacity *= 2;
            T[] newArr = (T[]) new Object[capacity];
            for(int i=0;i< arr.length;i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[len++] = item;
    }

    public void setItem(int index, T item) {
        if(index <0 || index > len) {
            throw new IllegalArgumentException();
        }
        arr[index] = item;
    }

    public String display() {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<len;i++) {
            str.append(arr[i] + ", ");
        }
        return str.toString();
    }
}
