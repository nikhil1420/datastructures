package com.tree.binarytree;

class Node1{
    int data;
    Node left;
    Node right;

    public Node1(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeRepresentation {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
    }
}
