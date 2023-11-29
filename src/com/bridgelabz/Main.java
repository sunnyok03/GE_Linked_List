package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Let's create a simple Linked List of 56, 30 and 70
        LinkedList<Integer> UC1 = new LinkedList<>(); // creating the list object
        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(70);
        UC1.head = first;
        first.next = second;
        second.next = third;


    }
}