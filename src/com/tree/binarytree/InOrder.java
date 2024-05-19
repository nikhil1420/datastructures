package com.tree.binarytree;

//Problem Statement: Given the root of a Binary Tree, write a recursive function that returns an array containing the preorder traversal of the tree.
//Input:Binary Tree: 4 2 5 3 -1 7 6 -1 9 -1 -1 8 -1 1
//Output: [4 2 3 9 1 5 7 6 8]

import java.util.ArrayList;
import java.util.List;

public class InOrder {

    // Function to perform preorder traversal
    // of the tree and store values in 'arr'
    static void inOrder(Node root, List arr) {
        // If the current node is NULL
        // (base case for recursion), return
        if (root == null) {
            return;
        }

        // Recursively traverse
        // the left subtree
        inOrder(root.left, arr);
        // Push the current node's
        // value into the list
        arr.add(root.data);
        // Recursively traverse
        // the right subtree
        inOrder(root.right, arr);
    }

    static List inOrder(Node root) {
        // Create an empty list to
        // store preorder traversal values
        List arr = new ArrayList<>();
        // Call the preorder traversal function
        inOrder(root, arr);
        // Return the resulting list
        // containing preorder traversal values
        return arr;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting preorder traversal
        List result = inOrder(root);

        // Displaying the preorder traversal result
        System.out.print("InOrder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (Object val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}