// https://www.hackerrank.com/challenges/absolute-permutation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static  List<Integer> permut( int n, int k){
        List<Integer> list=new ArrayList<Integer>();
        if(k==0){
            for(int i=1;i<=n;i++){
                list.add(i);
            }
            return list;
        }
        if(n%k==0){
            int period=n/k;
            if(period%2==0){
                int periodCount=0;
                for(int i=1;i<=n;i++){
                    if(periodCount%2==0){
                        list.add(i+k);
                    }else{
                        list.add(i-k);
                    }
                    if(i%k==0){
                        periodCount++;
                    }
                }
                return list;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
             int n = in.nextInt();
             int k = in.nextInt();
            List<Integer> result = permut(n,k);
            if(result!=null){
                for(int i:result){
                    System.out.print(i+" ");
                }
                System.out.print("\n");
            }else{
                  System.out.println("-1");
            }
            
        }
    }
}
