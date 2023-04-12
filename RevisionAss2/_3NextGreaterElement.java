/*2
4
11 13 21 3
5
11 9 13 21 3
Sample Output
11,13
13,21
21,-1
3,-1
11,13
9,13
13,21
21,-1
3,-1 */



import java.util.*;
public class _3NextGreaterElement {
    public static int[] NGE(int[] arr , int n){
        int[] ans  = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<n ; i++){
            while(!st.isEmpty() && (arr[i]>arr[st.peek()])){
                ans[st.pop()] =  arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()] = -1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i<t ; i++){
            int n =  sc.nextInt();
            int[] arr = new int[n];
            for(int j  = 0 ;j<n ; j++) arr[j] = sc.nextInt();
            int[] ans = NGE(arr,n);
            for(int k = 0 ; k<n ; k++){
                System.out.println(arr[k]+","+ans[k]);
            }
        }
        sc.close();
    }
}
