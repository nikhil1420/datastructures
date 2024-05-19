package com.tree.binarytree.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintRootToNode {

    static boolean getPath(Node root, List<Integer> arr, int B){
        // Base case: If the current
        // node is null, return false
        if (root == null) {
            return false;
        }

        // Add the current node's
        // value to the path list
        arr.add(root.data);

        // If the current node's value is equal
        // to the target value 'x', return true
        if (root.data == B) {
            return true;
        }

        if(getPath(root.left, arr, B) || getPath(root.right, arr, B)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    static List<Integer> solve(Node A, int B){
        // Initialize an empty
        // list to store the path
        List<Integer> arr = new ArrayList<>();

        // If the root node is null,
        // return the empty path list
        if (A == null) {
            return arr;
        }

        // Call the getPath function to find
        // the path to the node with value 'B'
        getPath(A, arr, B);

        // Return the path list
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        int targetLeafValue = 7;

        List<Integer> path = solve(root, targetLeafValue);

        System.out.print("Path from root to leaf with value " +
                targetLeafValue + ": ");
        for (int i = 0; i < path.size(); ++i) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
}
