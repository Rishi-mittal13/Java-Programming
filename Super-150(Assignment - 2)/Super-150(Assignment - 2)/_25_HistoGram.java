/*Sample Input
5
1 2 3 4 5
Sample Output
9 */

import java.util.*;
public class HistoGram {
    public static long[] prevSE(long[] arr , int n ){
        long[] ans = new long[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = n-1 ; i>=0 ; i--){
            while(!stk.isEmpty() && (arr[i]<arr[stk.peek()])){
                ans[stk.pop()] = i;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()) ans[stk.pop()] = -1;
        return ans;
    }
    public static long[] nextSE(long[] arr , int n ){
        long[] ans = new long[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            while(!stk.isEmpty() && (arr[i]<arr[stk.peek()])){
                ans[stk.pop()] = i;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()) ans[stk.pop()] = n;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] data = new long[n];
        for(int i = 0 ;i<n ; i++) data[i] = sc.nextLong();
        long[] PS = prevSE(data , n);
        long[] NS = nextSE(data , n);
        long max = 0 ;
        for(int i = 0 ;i<n ; i++){
            long val = (NS[i]-PS[i]-1)*data[i];
            if(val>max) max = val;
        }
        System.out.println(max);
        sc.close();
    }
}
