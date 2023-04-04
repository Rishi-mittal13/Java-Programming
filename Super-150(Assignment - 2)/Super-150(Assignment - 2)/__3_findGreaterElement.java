/*Sample Input
3
1 2 3
Sample Output
2 3 -1 */

import java.util.*;
//1.approach -1 (brute force).
/*public class __3_findGreaterElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<n ; i++){
            nums[i] =sc.nextInt();
        }
        int  max = Integer.MIN_VALUE,m=0,j=0;
        int[] arr = new int[n];
        for(int i : nums) if(i>max) max = i ;
        while(j<n){
            m++;
            m = m%n;
            if(nums[j]<nums[m]){
                arr[j] = nums[m];
                j++;
                m = j;
            }
            else if(nums[m]==max){
                arr[j] = -1;
                j++;
                m=j;
            }
        }
        for(int i = 0 ;i<arr.length ; i++){
            System.out.print(arr[i]+" " );
        }
        sc.close();
    }
}*/

//Approach - 2 (By stack).
public class __3_findGreaterElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] ans = St()
        
    }
}
