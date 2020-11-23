package com.ds.Queue;

import java.util.Scanner;

public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray<Integer> q = new QueueArray<Integer>();
        int opt = -1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nQUEUE ARRAY OPERATIONS\n ------------------------------");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. QUIT");
            System.out.println("Enter Option :");
            opt = sc.nextInt();
            switch (opt) {
                case 1 :
                    System.out.println("Enter data : ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.disp();
                    break;
                case 4:
                    System.out.println("Quitting....");
                    break;
                default: System.out.println("Wrong Entry!!!");
            }
        } while(opt != 4);

    }
}
