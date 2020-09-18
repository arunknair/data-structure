package com.ds.Array;

public class DynamicArray<T> {
    private T[] arr;
    private int len;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }
    public DynamicArray() {
        this(16);
    }
    public DynamicArray(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }
    public int size() {
        return len;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public T get(int index) {
        return (T) arr[index];
    }
    public void set(int index, T item) {
        arr[index] = item;
    }
    public void clear() {
        for(int i = 0; i < capacity; i++) {
            arr[i] = null;
        }
        len = 0;
        capacity = 0;
    }

    public void add(T item) {
        if(len+1 > capacity) {
            if(capacity == 0) {
                capacity = 1;
            } else {
                capacity *= 2;
            }
            T[] newArr = (T[]) new Object[capacity];
            for (int i=0;i<len;i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[len++] = item;
    }

    public T removeAtIndex(int index) {
        if(index > len || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        T data = arr[index];
        for(int i = index; i<len;i++) {
            arr[i] = arr[i+1];
        }
        arr[len--] = null;
        return data;
    }

    public int indexOf(T obj) {
        int i=0;
        for(;i<len;i++) {
            if(arr[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public T remove(T obj) {
        int index = indexOf(obj);
        if(index != -1) {
            return removeAtIndex(index);
        }
        return null;
    }

    public boolean contains(T obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("[ ");
        for(T item : arr) {
            res.append(item + ", ");
        }
        res.deleteCharAt(res.length()-1);
        res.append("]");
        return res.toString();
    }
}
