package com.graphs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class BipartiteUsingBFS {
    static boolean checkForBipartite(int start, ArrayList<ArrayList<Integer>> adj, int[] color)
    {
        Queue<Integer> q =  new LinkedList<>(); //BFS
        q.add(start);
        color[start] = 0;

        // until the queue is empty
        while(!q.isEmpty())
        {
            // source node and its parent node
            int node = q.remove();
            // go to all the adjacent nodes
            for(Integer it: adj.get(node))
            {
                if(color[it]==-1)
                {
                    color[it] = 1- color[node];
                    q.add(it);
                }

                // if adjacent node is visited and is not its own parent node
                else if(color[it] != color[node]) return false;
            }
        }

        return true;
    }

    // function to detect cycle in an undirected graph
    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int color[] = new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++)
            if(color[i]==-1)
                if(checkForBipartite(i, adj,color))
                    return true;

        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        boolean ans = isBipartite(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
    }
