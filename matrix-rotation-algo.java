// https://www.hackerrank.com/challenges/matrix-rotation-algo

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // row
        int m=sc.nextInt();
        
         // n: colon
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int[][] list = new int[m][n];
        
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
                list[i][j]=sc.nextInt();
            }
        }
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        for(int t=0;t<Math.min(n,m)/2;t++){
            ll.add(new ArrayList<Integer>());
            for(int a=t;a<n-t;a++){
               ll.get(t).add(list[t][a]);  
            }
             System.out.print("\t");
            for(int a=t+1;a<m-t;a++){
               ll.get(t).add(list[a][n-t-1]);   
            }
             System.out.print("\t");
            for(int a=n-t-2;a>=t;a--){
                ll.get(t).add(list[m-t-1][a]);     
            }
             System.out.print("\t");
             for(int a=m-t-2;a>t;a--){
                  ll.get(t).add(list[a][t]);  
             }
            Collections.rotate( ll.get(t), k*-1);
            
        }
        
        
        
    }
}
