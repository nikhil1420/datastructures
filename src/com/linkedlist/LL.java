package com.linkedlist;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;

import javax.sound.midi.Soundbank;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

     public Node getMiddle(Node head){
        Node fast =head;
        Node slow =head;
        while(fast!=null && fast.next!=null){
            fast =fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public Node reverseList(Node A) {
        Node p=null;
        Node t=head;
        Node c=head;
        while(c!=null){
            t=c.next;
            c.next = p;
            p=c;
            c=t;
        }
        return p;
    }
    public void reverserdList(){
//        Node reverse = reverseList(head);
//        System.out.println(reverse.data);
        Node x = getMiddle(head);
        Node mid = reverseList(getMiddle(x));
        System.out.println(mid.data);
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(tail==null)
            tail = head;
        size++;
    }

    public void insertAtLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next=null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtMiddle(int val, int pos){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos==size) {
            insertAtLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++)
            temp=temp.next;
        node.next = temp.next;
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;;
        head=head.next;
        return val;
    }

    public int deleteAtLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int value = tail.data;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }

    public int delete(int index){
        if(index==0)
            return deleteFirst();
        if(index==size-1)
            return deleteAtLast();
        Node node = getNode(index-1);
        int val = node.next.data;
        node.next = node.next.next;
        size--;
        return val;
    }

    public Node getNode(int index) {
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
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

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
