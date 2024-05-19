package com.linkedlist;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){

    }

    public CLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    void display(){
        Node node =head;
        if(head!=null) {
            do {
                System.out.print(node.data + "-->");
                node = node.next;
            } while (node != head);
        }

    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }



    private class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
