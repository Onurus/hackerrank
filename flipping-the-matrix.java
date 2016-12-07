//https://www.hackerrank.com/challenges/flipping-the-matrix

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        for(;q>0;q--){
            int n=sc.nextInt();
            int [][] data = new int[2*n][2*n];
            for(int i=0;i<2*n;i++){
                for(int j=0;j<2*n;j++){
                    data[i][j]=sc.nextInt();
                }
            }
            int result=0;
             for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    result=result + Math.max(Math.max(data[i][j], data[2*n-i-1][j]),
                                             Math.max(data[i][2*n-j-1], data[2*n-i-1][2*n-j-1]));
                }
            }
            System.out.println(result);
        }
    }
}
