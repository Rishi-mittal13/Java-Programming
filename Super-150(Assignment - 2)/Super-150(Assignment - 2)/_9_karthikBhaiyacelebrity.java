import java.util.*;


//1).brute - force Approach 
//T.C => O(n^2)  and S.C => O(n).
public class _9_karthikBhaiyacelebrity {
    public static String KBTC(int[][] mat , int n){
       /*  //1st Approach.
       int[] know = new int[n];
        int[] dontknow = new int[n];
        for(int i = 0 ;i<n ; i++){
            for(int j  = 0 ;j<n ; j++){
                if(mat[i][j]==1){
                    know[j]++;
                    dontknow[i]++;
                }
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(know[i]==(n-1) && dontknow[i]==0) return i+"";
        }
        return "No Celebrity";*/

        //2nd Approach :- T.c => O(n) , S.C=>O(1).
        int c = 0;
        for(int i = 0 ; i<n ; i++){
            if(mat[c][i]==1) c = i;
        }
        for(int i = 0 ; i<n ; i++ ){
            if(c!=i && (mat[i][c]==0 || mat[c][i]==1)) return "No Celebrity";
        }
        return c+"";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                mat[i][j] =  sc.nextInt();
            }
        }
        System.out.println(KBTC(mat , n));
        sc.close();
    }
}
