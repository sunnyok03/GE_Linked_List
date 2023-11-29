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

        //Ability to create Linked list by adding 30 and 56 to 70
        LinkedList<Integer>UC2 = new LinkedList<>(70);
        UC2.insertAtStart(30);
        UC2.insertAtStart(56);

        //Ability to create Linked List by appending 30 and 70 to 56
        LinkedList<Integer>UC3 = new LinkedList<>(56);
        UC3.insertAtEnd(30);
        UC3.insertAtEnd(70);

        //Ability to insert 30 between 56 and 70
        LinkedList<Integer>UC4 = new LinkedList<>(56);
        UC4.insertAtEnd(70);
        UC4.insertAtPosition(30,1);
    }
}