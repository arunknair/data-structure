package com.ds.revisit;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println(list.disp());
        list.addToLast(10);
        System.out.println(list.disp());
        list.addToLast(100);
        System.out.println(list.disp());
        list.addToLast(70);
        System.out.println(list.disp());
        list.addAtIndex(2, 111);
        System.out.println(list.disp());
    }
}
