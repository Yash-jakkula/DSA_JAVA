package StackAndQueue;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        // your code goes here
        int count = 0;
        for(int i=0; i<n-m+1; i++) {
            int sum=0;
            for(int j=i; j<i+m; j++) {
                sum+=squares[j];
            }
            if(sum==d) {
                count++;
            }
        }
        System.out.println(count);
    }
}