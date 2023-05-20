/*Sample Input
2
2
1 10
Sample Output
10 */
import java.util.*;
public class paintersPartition {
    public static boolean isPossible(int[] arr , int p , int b , int mid ){
        int c = 1 , sum = 0  , i  = 0 ;
        while(i<b){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
                i++;
            }
            else{
                c++;
                sum = 0  ;
            }
            if(c>p) return false;
        }
        return true;
    }
    public static int pp(int[] arr , int p , int  b ){
        Arrays.sort(arr);
        int low =  0 ,  high = 0 , mid  = 0  , ans  = 0 ; 
        for(int i : arr )  high+=i;
        while(low<=high){
            mid  =  (low+high)/2;
            if(isPossible(arr , p , b , mid)){
                ans =  mid;
                high =  mid-1;
            }
            else{
                low = mid +  1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p =  sc.nextInt();
        int b =  sc.nextInt();
        int[] arr =  new int[b];
        for(int i = 0 ;  i< b ;  i++) arr[i] =  sc.nextInt();
        int result =  pp(arr , p , b);
        System.out.println(result);
        sc.close();
    }
}
