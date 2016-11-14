import java.io.*;
import java.util.*;
import  java.math.BigInteger;

public class Solution {
    
    //https://www.hackerrank.com/contests/projecteuler/challenges/euler003
    
    public static long largestPrime(long in){
       
        long result=1;
        
          if(in%2==0){
                result=2;
                while(in%2==0){
                     in=in/2;
                 }
           }
            
        for(long k=3;k*k<=in;k=k+2){
          if(in%k==0){
                result=k;
                while(in%k==0){
                     in=in/k;
                 }
           }
        }
        if(in>result){
            if(new BigInteger(in+"").isProbablePrime(1)){
                result =in;
            }
        }
        
     
        return result;
     }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
           long l=sc.nextLong();            
            System.out.println(largestPrime(l));
        }

    }
}
