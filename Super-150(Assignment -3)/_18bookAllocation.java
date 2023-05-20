/*Sample Input
1
4 2
12 34 67 90
Sample Output
113  */
import java.util.Scanner;
public class bookAllocation{
    public static boolean isPossible(int[] arr , int n , int s , int mid){
        int c = 1 , sum =  0 , i = 0;
       while(i<n){
		   if(sum+arr[i]<=mid){
			   sum +=arr[i];
			   i++;
		   }
		   else {
			   sum = 0 ;
			   c++;
		   }
		   if(c>s) return false;
	   }
        return true;
    }
    public static int BA(int[] arr , int n , int s){
        int low = arr[0] , high = 0  , mid  = 0 , ans = 0 ;
        for(int i : arr) high+=i;
        while(low<=high){
            mid =  (low+high)/2;
            if(isPossible(arr, n, s, mid)){
                ans = mid;
                high = mid-1 ;
            }
            else {
                low =  mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
        int n =  sc.nextInt();
        int s =  sc.nextInt();
        int[] arr =  new int[n];
        for(int i = 0 ; i<n ; i++) arr[i] =  sc.nextInt();
        int ans =  BA(arr, n , s);
        System.out.println(ans);
    }
    sc.close();
    }
}
