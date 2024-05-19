package com.slidingwindow;

public class ChristmasTree  {

    public static int findMinCost(int[] A, int[] B) {
        int minCost = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if (A[i] < A[j] && A[j] < A[k]) {
                        int cost = B[i] + B[j] + B[k];
                        minCost = Math.min(minCost, cost);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            return -1;
        }

        return minCost;
    }

    public static void main(String[] args) {
        // Example Input 1
        int[] A1 = {1, 3, 5};
        int[] B1 = {1, 2, 3};
        int minCost1 = findMinCost(A1, B1);
        System.out.println(minCost1); // Output: 6

        // Example Input 2
        int[] A2 = {1, 6, 4, 2, 6, 9};
        int[] B2 = {2, 5, 7, 3, 2, 7};
        int minCost2 = findMinCost(A2, B2);
        System.out.println(minCost2); // Output: 7

        int[] A3 = {5,9,10,4,7,8};
        int[] B3 = {5,6,4,7,2,5};
        int minCost3 = findMinCost(A3, B3);
        System.out.println(minCost3); // Output: 7
    }
}


