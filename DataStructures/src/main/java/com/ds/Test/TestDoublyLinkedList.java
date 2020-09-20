package com.ds.Test;

import com.ds.LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int option = 0;
        do {
            System.out.println("Doubly Linked List\n--------------------------");
            System.out.println("1. Create a sample list");
            System.out.println("2. Add to Fist");
            System.out.println("3. Add to Last");
            System.out.println("4. Add to Position");
            System.out.println("9. Display");
            System.out.println("0. Exit");
            System.out.println("Enter your option : ");
            option = scanner.nextInt();
            switch (option) {
                case 1 :
                    dll = initialSample();
                    break;
                case 2 :
                    System.out.println("Enter data : ");
                    String data = scanner.next();
                    dll.addToFirst(data);
                    break;
                case 3 :
                    System.out.println("Enter data : ");
                    data = scanner.next();
                    dll.addToLast(data);
                    break;
                case 4 :
                    System.out.println("Enter data : ");
                    data = scanner.next();
                    System.out.println("Enter index : ");
                    int pos = scanner.nextInt();
                    dll.addToPosition(data, pos);
                    break;
                case 9:
                    System.out.println(dll);
                    break;
                case 0:
                    System.out.println("Exiting.............");
                    break;
                default: System.out.println("Wrong Entry!!!");
            }
        } while (option != 0);




//        DoublyLinkedList dll = initialSample();
//        dll.addToPosition("zero", 4);
//        dll.addToPosition("seven", 2);
//        dll.addToPosition("yellow", 1);
//        dll.addToPosition("red", 10);
//        System.out.println(dll);
    }

    private static DoublyLinkedList<String> initialSample() {
        DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
        dll.addToLast("one");
        dll.addToLast("two");
        dll.addToLast("five");
        dll.addToLast("ten");
        dll.addToFirst("eleven");
        dll.addToFirst("twelve");
        System.out.println(dll);
        return dll;
    }
}
