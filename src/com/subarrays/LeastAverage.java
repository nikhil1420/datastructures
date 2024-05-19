package com.subarrays;

public class LeastAverage {
    public static void main(String[] args) {
        int[] arr ={3, 7, 90, 20, 10, 50, 40};
        int B=3;
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=arr[i];
        }
        int max= sum;
        int s=1,e=B;
        int index = -1;
        while (e<arr.length){
            sum+=arr[e]- arr[s-1];
            System.out.println(sum);
            if(sum<max){
                max=sum;
                index = s;
            }
            s++;
            e++;
        }
        System.out.println(index);
    }
}
