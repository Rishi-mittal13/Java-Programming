/*Sample Input
5
1 2 3 4 5
Sample Output
9 */

import java.util.*;
public class _9Histogram {
    public static long[] prevS(long[] arr , int n){
        long ans[] = new long[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ;i>=0; i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()] ){
                ans[st.pop()] =  i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = -1;
        return ans;
    }
    public static long[] nextS(long[] arr , int n){
        long ans[] = new long[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<n; i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()] ){
                ans[st.pop()] =  i;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        long[] ar = new long[n];
        for(int i = 0 ; i<n ; i++) ar[i] =  sc.nextLong();
        long[] PS = prevS(ar,n);
        long[] NS = nextS(ar,n);
        long max  = 0 ;
        for(int i = 0 ;i<n ; i++){
            long val  =  (NS[i]-PS[i]-1)*ar[i];
            if(val>max) max = val;
        }
        System.out.println(max);
        sc.close();
    }
}


