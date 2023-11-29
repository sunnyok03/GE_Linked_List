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

        // Ability to delete the first element in the LinkedList of sequence 56->30->70
        LinkedList<Integer> UC5 = new LinkedList<>(56);
        UC5.insertAtEnd(30);
        UC5.insertAtEnd(70);
        UC5.deleteFirst();

        // Ability to delete the last element in the LinkedList of sequence 56->30->70
        LinkedList<Integer> UC6 = new LinkedList<>(56);
        UC6.insertAtEnd(30);
        UC6.insertAtEnd(70);
        UC6.deleteLast();

        //Ability to search LinkedList to find Node with value 30
        LinkedList<Integer> UC7 = new LinkedList<>(56);
        UC7.insertAtEnd(30);
        UC7.insertAtEnd(70);
        Node<Integer> temp = UC7.search(30);

        // Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
        LinkedList<Integer> UC8 = new LinkedList<>(56);
        UC8.insertAtEnd(30);
        UC8.insertAtEnd(70);
        UC8.insertAtPosition(40,2);

        //Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
        LinkedList<Integer> UC9 = new LinkedList<>(56);
        UC9.insertAtEnd(30);
        UC9.insertAtEnd(40);
        UC9.insertAtEnd(70);
        UC9.delete(40);
        System.out.println(UC9.size());

    }
}