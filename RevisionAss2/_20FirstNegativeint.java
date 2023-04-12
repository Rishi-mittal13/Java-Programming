/*Sample Input
2
8 3
12 -1 -7 8 -15 30 16 28
 8 4
12 -1 -7 8 -15 30 16 28
Sample Output
-1 -1 -7 -15 -15 0 
-1 -1 -7 -15 -15 */

import java.util.*;
public class _20FirstNegativeint {
    public static void printPP(int[] arr , int n , int k){
        int[] ans =  new int[n-k+1];
        for(int i = 0  ; i<(n-k) ; i++){
            for(int j  = i ;  j<(k+i) ; j++){
                if(arr[j]<0){
                    ans[i] =  arr[j];
                    break;
                }
            }
        }
        for(int val :  ans) System.out.print(val+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ;i<t ; i++){
        int n =  sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++) arr[i] =  sc.nextInt();
        printPP(arr, n, k);}
    }
}
