package com.tree.binarytree.hard;
//Problem Statement: Given a Binary Tree, convert the dataue of its nodes to follow the Children Sum Property. The Children Sum Property in a binary tree states that for every node, the sum of its children's dataues (if they exist) should be equal to the node's dataue. If a child is missing, it is considered as having a dataue of 0.
//Input:Binary Tree: 2 35 10 2 3 5 2
//Output: Binary Tree: 45 35 10 30 5 8 2
//https://takeuforward.org/data-structure/check-for-children-sum-property-in-a-binary-tree/
public class ChildrenSumProperty {

    // Function to change the dataues of the nodes
    // based on the sum of its children's dataues.
    public static void changeTree(Node root) {
        // Base case: If the current node
        // is null, return and do nothing.
        if (root == null) {
            return;
        }

        // Calculate the sum of the dataues of
        // the left and right children, if they exist.
        int child = 0;
        if (root.left != null) {
            child += root.left.data;
        }
        if (root.right != null) {
            child += root.right.data;
        }

        // Compare the sum of children with
        // the current node's dataue and update
        if (child >= root.data) {
            root.data = child;
        } else {
            // If the sum is smaller, update the
            // child with the current node's dataue.
            if (root.left != null) {
                root.left.data = root.data;
            } else if (root.right != null) {
                root.right.data = root.data;
            }
        }

        // Recursively call the function
        // on the left and right children.
        changeTree(root.left);
        changeTree(root.right);

        // Calculate the total sum of the
        // dataues of the left and right
        // children, if they exist.
        int tot = 0;
        if (root.left != null) {
            tot += root.left.data;
        }
        if (root.right != null) {
            tot += root.right.data;
        }

        // If either left or right child
        // exists, update the current node's
        // dataue with the total sum.
        if (root.left != null || root.right != null) {
            root.data = tot;
        }
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
  
    public static void main(String[] args) {
        // Create the binary tree
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        // Print the inorder traversal
        // of tree before modification
        System.out.print("Binary Tree before modification: ");
        inorderTraversal(root);
        System.out.println();

        // Call the changeTree function
        // to modify the binary tree
        changeTree(root);

        // Print the inorder traversal
        // after modification
        System.out.print("Binary Tree after Children Sum Property: ");
        inorderTraversal(root);
        System.out.println();
    }
}
