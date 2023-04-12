/*Sample Input
3
1 2 3
Sample Output
2 3 -1 */

import java.util.*;
public class _16FindTheGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i  = 0  ;i<n  ;i++) arr[i] = sc.nextInt();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1; i>=0  ;i--){
            while(!st.isEmpty() && (arr[i%n])>=arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i%n] = -1;
            else ans[i%n] = arr[st.peek()];
            st.push(i%n);
        }
        for(int  i : ans) System.out.print(i+" ");
    }
}
