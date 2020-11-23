package com.ds.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<T>();
    public Stack() {
    }
    public Stack(T item) {
        list.addLast(item);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" + list +
                '}';
    }
}
