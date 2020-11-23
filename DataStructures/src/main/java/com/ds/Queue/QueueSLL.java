package com.ds.Queue;

public class QueueSLL<T> {
    private Node<T> front = null;
    private Node<T> back = null;


    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void enqueue(T data) {
        Node<T> item = new Node<T>(data, null);
        if(front == null) {
            front = item;
            back = item;
        } else {
            item.next = back;
            back = item;
        }
    }

    public void dequeue() {
        if(front == null) {
            System.out.println("Empty!!!");
            return;
        }
        T item = front.data;
        if(front == back) {
            front = back = null;
        } else {
            Node ptr = back;
            while(ptr.next != front){
                ptr = ptr.next;
            }
            System.out.println(front.data + " now:" + ptr.data);
            ptr.next = null;
            front = null;
            front = ptr;
        }
        System.out.println("Item deleted : " + item);
    }

    public void disp() {
        Node<T> ptr = back;
        StringBuilder sb = new StringBuilder();
        if(front == null) {
            sb.append("Empty!!!");
        }
        while (ptr!=null) {
            sb.append(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println(sb.toString());
    }
}
