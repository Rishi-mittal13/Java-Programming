/*Sample Input
5
30
35
40
38
35
Sample Output
1 2 3 1 1 END */



import java.util.*;
public class _2StockSpan {
    public static int[] SS(int[] arr , int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,1);
       for(int i  = 0 ;i<n ; i++){
        while(!st.isEmpty() && arr[i]>arr[st.peek()]){
            ans[i]+=ans[st.pop()];
        }
        st.push(i);
       }
       return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n ; i++){
            arr[i]  = sc.nextInt();
        }
        int[] ans = SS(arr , n);
        for(int i = 0 ;i<n  ; i++) System.out.print(ans[i] + " ");
        System.out.print("END");
        sc.close();
    }
}
