import java.io.*;
import java.util.*;

public class Solution {
   
	// https://www.hackerrank.com/challenges/bomber-man

    public static void print(int[][] grid){
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( grid[i][j]==0){
                    System.out.print("O");
                }else{
                    System.out.print(".");
                }
            }
            System.out.print("\n");
        } 
    }

    
   
    public static int[][] gridA;
    public static int[][] gridFull;
    public static int[][] gridB;
    public static int[][] gridC;
    public static int r;
    public static int c;
    public static void change(int[][] temp,int i,int j){
        if(i<r && i>=0 && j<c && j>=0){
            temp[i][j]=-1;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         r=sc.nextInt();
         c=sc.nextInt();
        int n=sc.nextInt();
        sc.nextLine();
        
        gridA = new int[r][c];
         gridB = new int[r][c];
         gridC = new int[r][c];
         gridFull= new int[r][c];
        
        for(int i=0;i<r;i++){
            String s=sc.nextLine();
            for(int j=0;j<s.length();j++){
                gridFull[i][j]=0;
                gridB[i][j]=0;
                gridC[i][j]=0;

                if(s.charAt(j)=='.'){
                     gridA[i][j]=-1;
                }else{
                     gridA[i][j]=0;
                }
                
               
            }
        }
        
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(gridA[i][j]==0){
                    change(gridB,i,j);
                     change(gridB,i,j+1);
                     change(gridB,i,j-1);
                     change(gridB,i+1,j);
                     change(gridB,i-1,j);
                }
            }
       }
        
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(gridB[i][j]==0){
                    change(gridC,i,j);
                     change(gridC,i,j+1);
                     change(gridC,i,j-1);
                     change(gridC,i+1,j);
                     change(gridC,i-1,j);
                }
            }
       }
        
        
        if(n<2 ){
            print(gridA);
        }else{
            if( n%4==1){
                print(gridC);
            }else{
                if(n%2==0){
                    print(gridFull);
                }else{
                    print(gridB);
                } 
            }
            
        }
    }
}
