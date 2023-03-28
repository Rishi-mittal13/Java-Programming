/*6
2 1 5 6 2 3  //10 
*/

import java.util.*;
public class _11_Recycling {
    public static int[] nextGreater(int arr[],  int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<n; i++){
            while(!st.isEmpty() && (arr[st.peek()]>=arr[i])){
                ans[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = n;
        return ans;
    }
    public static int[] prevGreater(int[] arr , int n){
        int[] ans = new int[n];
        Stack<Integer>  st = new Stack<>();
        for(int i = n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && (arr[i]<arr[st.peek()])){
                ans[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = -1;
        return ans;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        /* // 1st APPROACH :- brute force approach .
        int max = 0 ;
        for(int i = 0 ; i<n ; i++){
            int left = i , right =  i;
            while((left>=0) && (arr[left]>=arr[i])){
                left--;
            }
            while((right<n) && (arr[right]>=arr[i])){
                right++;
            }
            int area = (right-left -1)*arr[i];
            if(area>max) max = area;
        }
        System.out.println(max);
        */

        //second Approach.
        int nextG[] = nextGreater(arr,n);
        int prevG[] = prevGreater(arr , n);
       
        int max = 0;
        for(int i  = 0 ;i<n ; i++){
            int area = (nextG[i]-prevG[i]-1)*arr[i];
            if(area>max) max = area;
        }
        System.out.println(max);
        sc.close();
    }
}
