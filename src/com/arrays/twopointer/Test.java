package com.arrays.twopointer;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 10;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIndex1 = -1;
        int minIndex2 = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum < target) {
                    min = Math.min(min, target - sum);
                    minIndex1 = i;
                    minIndex2 = j;
                }
            }
        }
        System.out.println(arr[minIndex1] + " " + arr[minIndex2]);
    }
}


//    static int[] twoSum(int []arr, int target) {
//        int sum =0;
//        int min = Integer.MAX_VALUE;
//        int minIndex1 = -1;
//        int minIndex2 =-1;
//
//        int i=0;
//        int j= arr.length-1;
//        while (i<j){
//            sum = arr[i] + arr[j];
//            if(sum < target){
//                min = Math.min(min,target - sum);
//                minIndex1 = i;
//                minIndex2 = j;
//                i++;
//            } else if (sum> target) {
//                j--;
//
//            }
//            else {
//                return new int[]{arr[minIndex1], arr[minIndex2]};
////                i++;
////                j--;
//            }
//        }
//    }
//}
