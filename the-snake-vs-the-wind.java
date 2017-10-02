//https://www.hackerrank.com/contests/university-codesprint-3/challenges/the-snake-vs-the-wind

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char d = in.next().charAt(0);
        int y = in.nextInt();
        int x = in.nextInt();
        
        
        char[] directions=null;
        int [][] grid=new int[n][n];
        
        switch(d){
            case 'e':
                directions="esnw".toCharArray();
                break;
            case 'w':
                directions="wsne".toCharArray();
                  break;
            case 's':
                directions="sewn".toCharArray();
                 break;
            case 'n':
                directions="news".toCharArray();
                 break;
        }
        
        in.close();
        int count=1;
        while(count<=n*n){
            grid[y][x]=count;
            count++;
            boolean moved=false;
            for(char i:directions){
               switch(i){
                    case 'e':
                       if(x+1<n &&  grid[y][x+1]==0){
                           moved=true;
                           x=x+1;
                       }
                       break;
                    case 'w':
                        if(x-1>=0 &&  grid[y][x-1]==0){
                           moved=true;
                           x=x-1;
                       }
                          break;
                    case 's':
                        if(y+1<n &&  grid[y+1][x]==0){
                           moved=true;
                           y=y+1;
                        }
                         break;
                    case 'n':
                         if(y-1>=0 &&  grid[y-1][x]==0){
                           moved=true;
                           y=y-1;
                        }
                         break;
                }
                if(moved){
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}

