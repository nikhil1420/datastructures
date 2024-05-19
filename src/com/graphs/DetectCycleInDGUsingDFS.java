package com.graphs;

import java.util.ArrayList;

public class DetectCycleInDGUsingDFS {

    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int pathVis[] )
    {
        vis[node] =1;
        pathVis[node] = 1;

        for(Integer it: adj.get(node))
        {
            // when the node is not visisted
            if(vis[it]==0)
            {
                if(dfs(it, adj, vis, pathVis)==true) return true;
            }
            // if the node has been previously visited but it has to be visited only in same path
            else if(pathVis[it] ==1) return true;
        }
        pathVis[node] = 0;
        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        for(int i=0;i<V;i++)
            if(vis[i]==0)
                if(dfs(i, adj, vis,pathVis))
                    return true;

        return false;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);

        boolean ans = isCycle(V, adj);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
