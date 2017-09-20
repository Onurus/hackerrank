//https://www.hackerrank.com/challenges/anagram/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
       if(s.length()%2==1)return -1;
        String s1 =s.substring(0,s.length()/2);
        String s2 =s.substring(s.length()/2,s.length());
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
         for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                map.put(c,-1);
            }
        }
        
        int result=0;
        for(int i:map.values()){
            if(i>0){
                result=result+i;
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}

