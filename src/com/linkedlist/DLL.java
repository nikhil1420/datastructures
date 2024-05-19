package com.linkedlist;

public class DLL {

    Node head;
    public void insetAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null)
            head.prev = node;
        head=node;
    }

    public void insertAtLast(int val){
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node node = new Node(val);
        node.prev = temp;
        temp.next = node;
        node.next = null;
    }

    void display() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +" -->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
