//https://www.hackerrank.com/challenges/queens-attack-2/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        
        int NE = Math.min(n-rQueen,n-cQueen);
        int E = n-cQueen;
        int SE = Math.min(rQueen-1,n-cQueen);
        int S = rQueen-1;
        int SW = Math.min(rQueen-1,cQueen-1);
        int W = cQueen-1;
        int NW = Math.min(n-rQueen,cQueen-1);
        int N = n-rQueen;
        
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            int rDiff=Math.abs(rQueen-rObstacle)-1;
            int cDiff=Math.abs(cQueen-cObstacle)-1;
            if(rObstacle==rQueen){
                
                if(cObstacle>cQueen){// East
                    E=Math.min(E,cDiff);
                }else{//West
                    W=Math.min(W,cDiff);
                }
            }else if(cObstacle==cQueen){
                if(rObstacle>rQueen){// North
                    N=Math.min(N,rDiff);
                }else{//South
                     S=Math.min(S,rDiff);
                }
            }else if(Math.abs(rObstacle-rQueen)==Math.abs(cObstacle-cQueen)){
                int rP=rObstacle-rQueen;
                int cP=cObstacle-cQueen;
                if(rP>0){
                    if(cP>0){// North-East
                        NE=Math.min(NE,cDiff);
                    }else{// North-West
                        NW=Math.min(NW,cDiff);
                    }
                }else{
                    if(cP>0){// South-East
                       SE=Math.min(SE,cDiff);
                    }else{// South-West
                        SW=Math.min(SW,cDiff);
                    } 
                }
            }
        }
        
        System.out.println(E+S+W+N+NE+SE+SW+NW);
    }
}

