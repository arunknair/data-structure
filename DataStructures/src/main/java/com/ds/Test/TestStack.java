package com.ds.Test;

import com.ds.Stack.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack);
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
