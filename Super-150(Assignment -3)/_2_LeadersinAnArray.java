/*Sample Input
4
5 7 10 6 
Sample Output
6 10  */

import java.util.*;
public class _2_LeadersinAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0  ;i<n ;  i++) arr[i] =  sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = n-1  ; i>=0 ; i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.empty()) {
                st.push(arr[i]);System.out.print(arr[i] +  " ");
            }
        }
        sc.close();
    }
}
