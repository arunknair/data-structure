package com.ds.LinkedList;

public class DoublyLinkedList<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T> {
        T data = null;
        Node<T> next = null;
        Node<T> prev = null;

        public Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(T data) {
        Node<T> item = new Node<T>(data, null, null);
        if(isEmpty()) {
            head = tail = item;
        } else {
            tail.next = item;
            tail = item;
        }
        size++;
    }

    @Override
    public String toString() {
        System.out.println("************DLL**************");
        System.out.println("Size : " + size);
        Node<T> pointer = head;
        StringBuffer res = new StringBuffer();
        while(pointer != null) {
            res.append(pointer.data + " <==>  ");
            pointer = pointer.next;
        }
        res.append("null");
        return res.toString();
    }
}
