/*Sample Input
6
2 1 5 6 2 3
Sample Output
10 */

import java.util.*;
public class _8Recycling {
    public static int[] prevS(int[] arr , int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ;i>=0 ; i--){
            while(!st.isEmpty() &&  arr[i]<arr[st.peek()] ){
                ans[st.pop()] =  i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] =  -1;
        return ans;
    }
    public static int[] nextS(int[] arr , int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<n ; i++){
            while(!st.isEmpty() &&  arr[i]<arr[st.peek()] ){
                ans[st.pop()] =  i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] =  n;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i<n ;i++){
            ar[i] = sc.nextInt();
        }
        int[] PS =  prevS(ar,n);
        int[] NS = nextS(ar,n);
        int max = 0 ;
        for(int i = 0 ;i<n ; i++){
            int val = (NS[i]-PS[i]-1)*ar[i];
            if(val>max) max = val;
        }
        System.out.println(max);
        sc.close();
    }
}
