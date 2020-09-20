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

    public void addToLast(T data) {
        System.out.println("Adding " + data + " to index " + (size+1));
        Node<T> item = new Node<T>(data, null, null);
        if(isEmpty()) {
            head = tail = item;
        } else {
            tail.next = item;
            item.prev = tail;
            tail = item;
        }
        size++;
    }

    public void addToFirst(T data) {
        System.out.println("Adding " + data + " to index 1");
        Node<T> item = new Node<T>(data,null,null);
        if(isEmpty()) {
            head = tail = item;
        } else {
            item.next = head;
            head.prev = item;
            head = item;
        }
        size++;
    }

    public void addToPosition(T data, int index) {
        if(index > size+1 || index <= 0) {
            throw new IllegalArgumentException();
        } else if (index == 1) {
            addToFirst(data);
        } else if (index == size + 1) {
            addToLast(data);
        } else {
            System.out.println("Adding " + data + " to index " + index);
            Node<T> pointer = head;
            int count = 1;
            while (pointer != null) {
                if(count == index) {
                    Node<T> item = new Node<T>(data, null, null);
//                    System.out.println(pointer.data + "  >>> " );
//                    System.out.println(pointer.prev + " >>> ");
                    pointer.prev.next = item;
                    item.next = pointer;
                }
                pointer = pointer.next;
                count++;
            }
            size++;
        }
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
