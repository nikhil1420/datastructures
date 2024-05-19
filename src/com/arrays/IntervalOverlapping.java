package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Interval{
    int startTime;
    int endTime;

    public Interval(int s, int e) {
        this.startTime = s;
        this.endTime = e;
    }

    public int getStartTime() {
        return startTime;
    }

    void print(){
        System.out.println("Start " +startTime + " EndTime "+endTime);
    }
}
public class IntervalOverlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Store a list of intervals
        Interval []arr = new Interval[n];
        //Read the intervals
        for(int i=0;i<n;i++){
            int s, e;
            s= sc.nextInt();
            e= sc.nextInt();
            arr[i] = new Interval(s,e);
        }
        Arrays.sort(arr, Comparator.comparing(Interval::getStartTime));
        for(int i=0;i<n;i++){
            arr[i].print();
        }
    }
}
