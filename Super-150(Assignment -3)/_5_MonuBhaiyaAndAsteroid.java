/*Sample Input
3
5 10 -5
Sample Output
[5,10] */
import java.util.*;
public class _5_MonuBhaiyaAndAsteroid{
    public static Stack<Integer>  fun(int[] arr , int n ){
        int i = 0  ;
        Stack<Integer>  st = new Stack<>();
        while(i<n){
            boolean b = true ;
            while(i<n && !st.isEmpty() && (arr[i]<0 && st.peek()>0)){
                b = false;
                if(Math.abs(arr[i])>st.peek()){
                    st.pop();
                    b =  true ;
                }
                else if(Math.abs(arr[i])==st.peek()) {
                    st.pop();
                    i++;
                }
                else i++;
            }
            if(b){
                st.push(arr[i]);
                i++;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i  =0  ; i<n ; i++) arr[i] =  sc.nextInt();
        Stack<Integer>  st =  fun(arr , n);
        System.out.println(st);
        sc.close();
    }
}