package com.ds.Test;

import com.ds.Stack.StackArray;

public class TestStackArr {
    public static void main(String[] args) {
        StackArray<Integer> array = new StackArray();
        System.out.println(array.disp());
        array.push(1);
        array.push(2);
        array.push(0);
        array.push(20);
        System.out.println(array.disp());
        System.out.println(array.pop());
        System.out.println(array.disp());
    }
}
