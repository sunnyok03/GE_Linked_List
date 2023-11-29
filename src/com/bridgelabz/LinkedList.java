package com.bridgelabz;

/*
@desc: Linked List implementation for generics data type
 */
public class LinkedList<T extends Comparable<T>> {
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

    // deletion of start node
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // deletion of last node
    public void deleteLast(){
        if(head == null){
            return;
        }
        Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp = null;
    }

    // search in a linked list
    public Node<T> search(T element){
        Node<T> temp = head;
        while(temp != null){
            if(temp.data == element){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /*
    @desc: finding size of the linked list
    @params:
    @return: int (size of the list)
     */
    public int size(){
        int size = 0;
        Node<T> temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    //delete node
    public void delete(T data){
        Node<T> temp = head;
        Node<T> prev = head;
        if(head.data == data){
            head = head.next;
            return;
        }
        while(temp != null){
            prev = temp;
            temp = temp.next;
            if(temp != null && temp.data == data){
                prev.next = temp.next;
                return;
            }
        }
    }

    // insert in ordered
    public void insertInOrder(T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}