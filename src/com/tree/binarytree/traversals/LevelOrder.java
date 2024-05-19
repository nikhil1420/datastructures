package com.tree.binarytree.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Getting preorder traversal
        List<List<Integer>> result = levelOrder(root);
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> levelOrder(Node root){
        // Create a list of lists to store levels
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root==null) // If the tree is empty, return an empty list
            return ans;

        //add root node
        queue.add(root);

        while (!queue.isEmpty()){
            // Get the size of the current level
            int size = queue.size();
            // Create a list to store
            // nodes at the current level
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                // Get the front node in the queue
                Node node = queue.poll();
                // Store the node value in the current level list
                level.add(node.data);
                // Enqueue the child nodes if they exist
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            // Store the current level in the answer list
            ans.add(level);
        }
        return ans;
        }
}
