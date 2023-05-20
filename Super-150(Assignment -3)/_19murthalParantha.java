/*Sample Input
10
4 
1 2 3 4
Sample Output
12 */

import java.util.*;
public class _19murthalParantha {
    public static boolean isPossible(int[] arr , int p , int c , int mid ){
        int i =  0 , totalp = 0   ,  part  = 1 , time =0 ; 
        while(i<c){
            if((time+part*arr[i])<=mid){
                time = time +  part*arr[i];
                part++;
                totalp++;
            }
            else{
                i++;
                part =  1;
                time = 0 ;
            }
            if(totalp==p) return true;
        }
        return false;
    }
    public static int murthalParantha(int[] arr , int p , int c ){
        int low =  1 , high = arr[c-1]*(p*(p+1))/2 , ans = 0 ;
        while(low<=high){
            int mid =  (low+high)/2;
            if(isPossible(arr, p, c, mid)){
                ans =  mid ;
                high  = mid-1;
            }
            else {
                low  =  mid+1 ;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pa  = sc.nextInt();
        int ck = sc.nextInt();
        int[]  arr = new int[ck];
        for(int i  = 0 ; i<ck ; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int ans =  murthalParantha(arr, pa , ck );
        System.out.println(ans);
        sc.close();
    }
}