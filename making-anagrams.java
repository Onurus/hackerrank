// https://www.hackerrank.com/challenges/making-anagrams/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        String abc ="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer> map = new  HashMap<Character,Integer> ();
        for(int i=0;i<abc.length();i++){
            map.put(abc.charAt(i),0);
        }
         for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            map.put(c,map.get(c)+1);
        }
         for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            map.put(c,map.get(c)-1);
        }
        return map.values().stream().mapToInt(Integer::intValue).map(x->Math.abs(x)).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}

