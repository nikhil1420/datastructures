package com.tree.bst;

//https://takeuforward.org/data-structure/search-in-a-binary-search-tree-2/
public class CeilInBst {

    public static int findCeil(Node root, int key) {
        // Initialize the variable to store the ceiling value
        int ceil = -1;

        // Traverse the BST until reaching
        // the end or finding the key
        while (root != null) {
            // If the key is found, assign it
            // as the ceiling and return
            if (root.data == key) {
                ceil = root.data;
                return ceil;
            }

            // If the key is greater,
            // move to the right subtree
            if (key > root.data) {
                root = root.right;
            } else {
                // If the key is smaller, update ceil
                // and move to the left subtree
                ceil = root.data;
                root = root.left;
            }
        }
        // Return the computed ceiling value
        return ceil;
    }
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    public static void printInOrder(Node root) {
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
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(10);

        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();

        // Searching for a value in the BST
        int target = 8;
        int result = findCeil(root, target);

        // Displaying the search result
        if (result != -1) {
            System.out.println("Ceiling of " + target + " is: " + result);
        } else {
            System.out.println("No ceiling found!");
        }
    }
}
