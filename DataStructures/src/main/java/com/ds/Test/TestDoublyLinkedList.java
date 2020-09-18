package com.ds.Test;

import com.ds.LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
        dll.add("one");
        dll.add("two");
        dll.add("five");
        dll.add("ten");
        System.out.println(dll);
    }
}
