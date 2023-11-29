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

}