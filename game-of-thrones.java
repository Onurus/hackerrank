//https://www.hackerrank.com/challenges/game-of-thrones/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
      HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        int result =0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
               map.put(s.charAt(i),map.get(s.charAt(i))+1); 
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i:map.values()){
            if(i%2==1){
                result ++;
            }
        }
        return (result<2)?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}

