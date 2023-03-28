/*2
8 3
12 -1 -7 8 -15 30 16 28 //-1 -1 -7 -15 -15 0 .
 8 4
12 -1 -7 8 -15 30 16 28 */ //-1 -1 -7 -15 -15.

import java.util.Scanner;
public class _7_Firstneginwindk {
    public static int[] FNN(int[] arr , int n , int k){
        int[] ans = new int[n-k+1];
        int ind  = 0;
        for(int i = 0 ; i<=(n-k) ; i++){
            boolean flag = true;
            while((ind>=i) && (ind<(k+i)) && flag){
                if(arr[ind]<0) {
                    ans[i] = arr[ind];
                    flag = false;
                    if(ind==i) ind++;
                }
                else ind++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        for(int i = 0 ;i<t ; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ;j<n ; j++){
                arr[j]  = sc.nextInt();
            }
            int[] ans = FNN(arr,n,k);
            for(int elm : ans)  System.out.print(elm+" ");
            System.out.println();
        }
        sc.close();
    }
}
