import java.io.*;
import java.util.*;

public class Solution {

    // https://www.hackerrank.com/challenges/bigger-is-greater
    
    public static String scan(String s){
        char[] list = s.toCharArray();
        int k=-1;
        out:
        for(int i = list.length-2 ; i>=0 ; i--){
            for(int j = i+1 ; j< list.length ; j++){
                if(list[i]<list[j]){
                    k=i;
                    break out;        
                }
            }    
        }
        if(k==-1){
            return "no answer";
        }
        char biggestSmall='z';
        int biggestSmallIndex=-1;
        for(int i=k+1; i< list.length ; i++){
            if(list[i]>list[k] && biggestSmall>list[k]){
                biggestSmall=list[i];
                 biggestSmallIndex=i;
            }
        }
        
        list[biggestSmallIndex]=list[k];
        list[k]=biggestSmall;
        
        List<Character> charlist = new ArrayList<Character>();
           for(int i=k+1; i< list.length ; i++){
                charlist.add(list[i]);   
           }
        Collections.sort(charlist);
        int t = 0;
        for(int i=k+1; i< list.length ; i++){
            list[i]=charlist.get(t); 
            t++; 
        }
        return new String(list);
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            System.out.println(scan(s));
        }
    }
}
