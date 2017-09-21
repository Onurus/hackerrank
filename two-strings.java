// https://www.hackerrank.com/challenges/two-strings/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    static List<Character> convertStrToDistinctChars(String str){
        List<Character> result = new ArrayList<Character>();
        IntStream.range(0, str.length()-1).mapToObj(i->str.charAt(i)).distinct().forEach(i->result.add(i));
        return result;
    }
    static String twoStrings(String s1, String s2){
        List<Character> l1=convertStrToDistinctChars(s1);
        List<Character> l2=convertStrToDistinctChars(s2);
        
        for(Character c:l1){
            if(l2.contains(c)){
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}

