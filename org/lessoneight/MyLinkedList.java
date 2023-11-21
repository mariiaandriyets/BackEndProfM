package com.proftelran.org.lessoneight;

public class MyLinkedList {

    private Node head = null;

    private int size = 0;

    /// 8 -> 3 -> 4 -> 2 -> 15
    public void pushToTail(int data){
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.getNext()!=null) {
            node = node.getNext();
        }
        node.setNext(newNode);
        size++;
    }
    public void print () {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void add(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }
}
