import java.io.*;
import java.util.*;

public class Solution {
	
	// https://www.hackerrank.com/challenges/larrys-array
    public static int [] shiftList(int [] list,int n,int actual ,int index){
        if(actual==index){
            return list;
        }
        if(actual-index==1){
             int value_minus=list[actual-1];
            int value=list[actual];
            int value_plus=list[actual+1];

            list[actual-1]=value;
            list[actual]=value_plus;
            list[actual+1]=value_minus;

            return shiftList(list,n,actual-1,index);
        }else{
            int value_minus2=list[actual-2];
             int value_minus1=list[actual-1];
             int value=list[actual];
            

            list[actual-2]=value;
            list[actual-1]=value_minus2;
            list[actual]=value_minus1;

            return shiftList(list,n,actual-2,index);
        }
       
    }
    
    public static boolean checkFor(int [] list,int n, int index){
        if(index==n-2){
            return (list[n-2]==(n-1));    
        }
        
        int expectedValue=index+1;
        
        if(list[index]!=expectedValue){
            
            for(int i=index;i<n;i++){
                if(list[i]==expectedValue){
                    list=shiftList(list,n,i,index);
                    break;
                }
            }    
            
            
        }
        
        
        return checkFor(list,n,index+1);
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
            for(int j=0;j<t;j++){
                int n=sc.nextInt();
                int [] list = new int[n];
                for(int i=0;i<n;i++){
                    list[i]=sc.nextInt();
                }
             boolean result = checkFor(list,n,0);  
             System.out.println(result?"YES":"NO");   
           }
        
    }
}
