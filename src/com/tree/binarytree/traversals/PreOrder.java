package com.tree.binarytree.traversals;

import com.tree.binarytree.traversals.Node;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Getting preorder traversal
        List<Integer> result = preOrder(root);
        for (Integer val:result){
            System.out.print(val+" ");
        }
    }

    static List<Integer> preOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    static void preorder(Node root, List<Integer> arr){
        if(root==null) return;
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
}
