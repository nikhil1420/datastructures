package com.tree.bst;

public class KthLargestSmallest {
    // Recursive function to perform in-order traversal
    private static void printInOrder(Node root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.data + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        // Creating a BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);

        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();


        // Find the Kth smallest and largest elements
        int k = 3;
        System.out.println("k: " + k);
        int[] kthElements =new int[0];//findKth(root, k);

        System.out.println("Kth smallest element: " + kthElements[0]);
        System.out.println("Kth largest element: " + kthElements[1]);
    }
}
