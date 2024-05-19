package com.tree.binarytree.medium;
//Problem Statement: Given a Binary Tree, perform the boundary traversal of the tree. The boundary traversal is the process of visiting the boundary nodes of the binary tree in the anticlockwise direction, starting from the root.
//Boundary Traversal: 1 2 4 5 6 7 3
import java.util.ArrayList;
import java.util.List;

public class BoundaryOrderTraversal {

    static boolean isLeaf(Node root){
        if(root.left==null && root.right == null) return true;
        return false;
    }

    // Function to add the
    // left boundary of the tree
    static void addLeftBoundary(Node root, List<Integer> res) {
        Node curr = root.left; // curr points to left child
        while(curr!=null){
            if(!isLeaf(curr)) // if not leaf node add value
                res.add(curr.data);
            if(curr.left!=null)
                curr=curr.left; //move left
            else
                curr=curr.right; // move right
        }
    }

    static void addRightBoundary(Node root, List<Integer> res) {
        Node curr = root.right; // curr points to right child
        while(curr!=null){
            if(!isLeaf(curr)) // if not leaf node add value
                res.add(curr.data);
            if(curr.right!=null)
                curr=curr.right; //move right
            else
                curr=curr.left; // move left
        }
    }

    static void addLeaves(Node root, List<Integer> res) {
        // If the current node is a
        // leaf, add its value to the result
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        // Recursively add leaves of
        // the left and right subtrees
        if (root.left != null) {
            addLeaves(root.left, res);
        }
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }


    static List<Integer> printBoundary(Node root){
        List<Integer> res = new ArrayList<>();
        if(root ==null) return res;
        // If the root is not a leaf,
        // add its value to the result
        if (!isLeaf(root)) {
            res.add(root.data);
        }

        // Add the left boundary, leaves,
        // and right boundary in order
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);

        return res;
    }

    // Helper function to
    // print the result
    static void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Get the boundary traversal
        List<Integer> result = printBoundary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        printResult(result);
    }
}
