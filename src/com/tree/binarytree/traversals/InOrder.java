package com.tree.binarytree.traversals;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Getting preorder traversal
        List<Integer> result = inOrder(root);
        for (Integer val:result){
            System.out.print(val+" ");
        }
    }

    static List<Integer> inOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    static void inorder(Node root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}
