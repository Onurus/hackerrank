// https://www.hackerrank.com/contests/university-codesprint-3/challenges/erupting-volcanoes

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]grid = new int[n][n];
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int w = in.nextInt();
            // Write Your Code Here
            int x1,x2,y1,y2;
            x1=Math.max(x-w+1,0);
            x2=Math.min(x+w-1,n-1);
            y1=Math.max(y-w+1,0);
            y2=Math.min(y+w-1,n-1);
            
            for(int y3=y1;y3<=y2;y3++){
                int yDif=w-Math.abs(y3-y);
                 for(int x3=x1;x3<=x2;x3++){
                      int xDif=w-Math.abs(x3-x);
                     grid[y3][x3]=grid[y3][x3]+Math.min(xDif,yDif);
                 }
            }
        }
         int max=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                max=Math.max(max, grid[i][j]);
            } 
        }
        System.out.println(max);
        in.close();
    }
}

