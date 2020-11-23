package com.ds.revisit;

public class TestDynaArray {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<Integer>(3);
        System.out.println(array.size());
        array.addItem(10);
        array.addItem(20);
        array.addItem(30);
        array.addItem(40);
        System.out.println(array.display());
        array.setItem(0, 100);
        System.out.println(array.display());
    }
}
