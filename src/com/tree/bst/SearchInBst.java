package com.tree.bst;

//https://takeuforward.org/data-structure/search-in-a-binary-search-tree-2/
public class SearchInBst {

    // This function searches for a node with
    // a specified value in a Binary Search Tree (BST).
    public static Node searchBST(Node root, int val) {
        // Loop until either the tree is
        // exhausted (null) or the value is found.
        while (root!=null && root.data!=val){
            // Check if the target value is
            // less than the current node's value.
            // If so, move to the left subtree
            // (values smaller than the current node).
            // Otherwise, move to the right subtree
            // (values larger than the current node).
            root= val<root.data? root.left: root.right;
        }
        return root;
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
        int target = 6;
        Node result = searchBST(root, target);

        // Displaying the search result
        if (result != null) {
            System.out.println("Value " + target + " found in the BST!");
        } else {
            System.out.println("Value " + target + " not found in the BST.");
        }
    }
}
