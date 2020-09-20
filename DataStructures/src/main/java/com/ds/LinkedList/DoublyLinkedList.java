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
                    pointer.prev.next = item;
                    item.next = pointer;
                }
                pointer = pointer.next;
                count++;
            }
            size++;
        }
    }

    public T removeFirst() {
        if(isEmpty()) {
            System.out.println("Empty list!!!");
            return null;
        }
        T data = head.data;
        if(getSize() == 1) {
            head = tail = null;
        } else {
            Node<T> pointer = head;
            pointer.next.prev = null;
            head = head.next;
        }
        size--;
        return data;
    }

    public T removeLast() {
        if(isEmpty()) {
            System.out.println("Empty list!!!");
            return null;
        }
        T data = tail.data;
        if(getSize() == 1) {
            head = tail = null;
        } else {
            Node<T> pointer = tail;
            pointer.prev.next = null;
            tail = tail.prev;
            pointer = null;
        }
        size--;
        return data;
    }

    public T remove(T data) {
        if(isEmpty()) {
            System.out.println("Empty list!!!");
            return null;
        }
        T removedData = null;
        Node<T> pointer = head;
        while (pointer != null) {
            if(pointer.data.equals(data)) {
                if(pointer == head) {
                    removedData = removeFirst();
                } else if(pointer == tail) {
                    removedData = removeLast();
                } else {
                    removedData = pointer.data;
                    pointer.prev.next = pointer.next;
                    pointer.next.prev = pointer.prev;
                    pointer = null;
                    size--;
                }
                break;
            }
            pointer = pointer.next;
        }
        if(removedData == null) {
            System.out.println("Cannot find the data!!!");
        }
        return removedData;
    }

    public T removeAtPosition(int index) {
        if (isEmpty()) {
            System.out.println("Empty list!!!");
            return null;
        }
        if(getSize() < index || index <= 0) {
            System.out.println("invalid index!!!!");
            return null;
        }
        T data = null;
        int count = 1;
        Node<T> pointer = head;
        while(pointer != null) {
            if(count == index) {
                if(pointer == head) {
                    data = removeFirst();
                } else if(pointer == tail) {
                    data = removeLast();
                } else {
                    data = pointer.data;
                    pointer.prev.next = pointer.next;
                    pointer.next.prev = pointer.prev;
                    pointer = null;
                    size--;
                }
                break;
            }
            count++;
            pointer = pointer.next;
        }

        return data;
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
