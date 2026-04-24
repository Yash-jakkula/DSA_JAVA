package Greedy;

import java.util.Arrays;

public class LeetCode452 {
    public static void main(String args[]){
        // initialize with your own inputs focus on logic below
        int[][] points = new int[2][2];

        Arrays.sort(points,(a, b) -> Integer.compare(a[1],b[1]));
        int arrows = 1;
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            if(end < points[i][0]){
                arrows++;
                end = points[i][1];
            }
        }
        System.out.println(-102/93);
        System.out.println(arrows);
    }
}
