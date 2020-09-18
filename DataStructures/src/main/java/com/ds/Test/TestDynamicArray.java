package com.ds.Test;

import com.ds.Array.DynamicArray;

public class TestDynamicArray {

    public static void main(String[] args) {
        //testAdditionToDynamicArray();
        //testRemoveAtIndexDynamicArray();
        //testIndexofAndRemoveDynamicArray();
        testContainsDynamicArray();
    }

    private static void testContainsDynamicArray() {
        DynamicArray<String> da = new DynamicArray<String>(1);
        da.add("one");
        da.add("two");
        da.add("three");
        da.add("four");
        da.add("five");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        System.out.println(da.contains("five"));
    }

    private static void testIndexofAndRemoveDynamicArray() {
        DynamicArray<String> da = new DynamicArray<String>(1);
        da.add("one");
        da.add("two");
        da.add("three");
        da.add("four");
        da.add("five");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        System.out.println(da.indexOf("three"));
        System.out.println("Removed item : " + da.remove("three"));
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
    }

    private static void testRemoveAtIndexDynamicArray() {
        DynamicArray<String> da = new DynamicArray<String>(1);
        da.add("one");
        da.add("two");
        da.add("three");
        da.add("four");
        da.add("five");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        System.out.println("Remove item : " + da.removeAtIndex(2));
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
    }

    private static void testAdditionToDynamicArray() {
        DynamicArray<String> da = new DynamicArray<String>(1);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("One");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Two");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Three");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Four");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Five");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Six");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Seven");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Eight");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Nine");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.clear();
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
        da.add("Nine");
        System.out.println(da);
        System.out.println("Size : " + da.size() + " >> Capacity : " + da.getCapacity());
    }
}
