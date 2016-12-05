import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	//https://www.hackerrank.com/challenges/between-two-sets
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
       
        int factor = gcd(b)/lcm(a);
        if(factor<=0){
             System.out.println(0);
            return ;
        }
        int result=1;
        
        for(int i=2;i<=factor;i++){
            int temp=0;
            while(factor%i==0){
                factor=factor/i;
                temp++;
            }           
            if(temp!=0){
                result=result*(temp+1);
            }
        }
        
        System.out.println(result);
    }
    
    private static int gcd(int a, int b){
    while (b > 0){
        int temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
    }

    private static int gcd(int[] input){
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
        return result;
    }
    private static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input){
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }
}

