import java.io.*;
import java.util.*;

public class Solution {
    
	// https://www.hackerrank.com/challenges/almost-sorted

    public static int[] originalList;
    public static int[] sortedList;
    public static int n;
    
   
    public static boolean checkReverse(int start,int stop){
        for(int i=0;i<=stop-start;i++){
            if(sortedList[start+i]!=originalList[stop-i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        originalList = new int[n];
        sortedList = new int[n];
        for(int i=0;i<n;i++){
            originalList[i] = sc.nextInt();
            sortedList[i] = originalList[i] ;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(sortedList);
        for(int i=0;i<n;i++){
            if(originalList[i]!=sortedList[i]) {
                list.add(i+1);
            }     
        }
        
        if(list.size()==2){
             System.out.println("yes");
            System.out.println("swap "+list.get(0)+" "+list.get(1));
        }else{
            if(list.size()>2){
                if(checkReverse(list.get(0)-1, list.get(list.size()-1)-1))  {
                     System.out.println("yes");
                    System.out.println("reverse "+list.get(0)+" "+(list.get(list.size()-1)));
                }  else{
                     System.out.println("no");
                }
            }else{
                 System.out.println("no");
            }
            
           
        }
        
        
    }
}
