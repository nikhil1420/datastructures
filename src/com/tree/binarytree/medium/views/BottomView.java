package com.tree.binarytree.medium.views;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


public class BottomView {

    static List<Integer> bottomView(Node root){
        // List to store the result
        List<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;

        // Map to store the top view nodes
        // based on their vertical positions
        Map<Integer, Integer> mpp = new TreeMap<>();

        Queue<Pair<Node, Integer>> queue = new LinkedList<>();

        queue.add(new Pair<>(root, 0));
         while (!queue.isEmpty()){
             // Retrieve the node and its vertical position from the front of the queue
             Pair<Node, Integer> pair = queue.poll();
             Node node = pair.getFirst();
             int line = pair.getSecond();
             // If the vertical position is not already in the map, add the node's data to the map

                 mpp.put(line, node.data);

             // Process left child
             if (node.left != null) {
                 // Push the left child with a decreased
                 // vertical position into the queue
                 queue.add(new Pair<>(node.left, line - 1));
             }

             // Process right child
             if (node.right != null) {
                 // Push the left child with a decreased
                 // vertical position into the queue
                 queue.add(new Pair<>(node.right, line + 1));
             }
         }

        // Transfer values from the
        // map to the result list
        for (int value : mpp.values()) {
            ans.add(value);
        }

        return ans;
    }


    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        // Get the top view traversal
        List<Integer> topView = bottomView(root);

        // Print the result
        System.out.println("Bottom View: ");
        for (int node : topView) {
            System.out.print(node + " ");
        }
    }
}
