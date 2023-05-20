/*Sample Input
4
3 2 1 4
Sample Output
7 */

import java.util.*;
public class _11_MonuBhaiyaAndStack {
    public static int result(int[] arr , int n){
        int count  = 0 ;
        Stack<Integer> stk = new Stack<>();
        int c  = 0;
        boolean b =  false;
        for(int i  = 0 ; i<n ; i++){
            if(stk.isEmpty()) stk.push(arr[i]);
            else{
                if((stk.peek()-arr[i])==1 ) {
                    c++;
                    count+=c;
                }
                else{
                    c  = 0 ;
                }
                stk.push(arr[i]);
            }
        }
        return count+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0  ; i<n; i++) arr[i] =  sc.nextInt();
        int count =  result(arr,n);
        System.out.println(count);
        sc.close();
    }
}
