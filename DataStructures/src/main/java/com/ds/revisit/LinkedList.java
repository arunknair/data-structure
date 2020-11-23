package com.ds.revisit;

public class LinkedList<T> {
    class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size =0;

    public void addToLast(T data) {
        Node<T> item = new Node<T>(data,null,null);
        if(tail == null) {
            head = tail = item;
        } else {
            tail.next = item;
            item.prev = tail;
            tail = item;
        }
        size++;
    }

    public void addAtIndex(int index, T data) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        Node<T> item = new Node<T>(data, null, null);
        if(index == 0) {
            head.prev = item;
            item.next = head;
            head = item;
        }

        Node<T> ptr = head;
        int cnt=1;
        while (ptr!=null) {
            if(cnt == index) {
                break;
            }
            ptr = ptr.next;
            cnt++;
        }

        ptr.prev.next = item;
        item.prev = ptr.prev;
        item.next = ptr;
        size++;
    }

    public String disp() {
        Node<T> ptr = head;
        StringBuilder str = new StringBuilder();
        if(head == null && tail == null) {
            System.out.println("Empty List!!!");
        }
        while(ptr!=null) {
            str.append(ptr.data + "->");
            ptr = ptr.next;
        }
        return str.toString();
    }
}
