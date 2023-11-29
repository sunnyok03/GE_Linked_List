package com.bridgelabz;

/*

 */
public class LinkedList<T> {
    public Node<T> head;

    public LinkedList(){}
    public LinkedList(T data){
        this.head = new Node<>(data);
    }

    // insert at start
    public void insertAtStart(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        this.head = newNode;
    }


    // insertion at last
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // insertion at kth pos
    public void insertAtPosition(T data, int k) {
        Node<T> newNode = new Node<>(data);

        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> curr = head;
        while(curr!= null && k > 1){
            curr = curr.next;
            k--;
        }

        if (curr == null) {
            System.out.println("Exceeding list length.");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }


}