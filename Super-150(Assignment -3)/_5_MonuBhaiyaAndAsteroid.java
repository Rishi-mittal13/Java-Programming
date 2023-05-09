/*Sample Input
3
5 10 -5
Sample Output
[5,10] */
import java.util.*;
public class _5_MonuBhaiyaAndAsteroid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i  =0  ; i<n ; i++) arr[i] =  sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i <n ; i++){
            if(st.isEmpty()) st.push(arr[i]);
            else{
                if(!st.isEmpty() && st.peek()>0 && arr[i]>0){
                    st.push(arr[i]);
                }
                else{
                    if(arr[i]>0 && st.peek()<0){
                        int val = Math.abs(st.peek()) ;
                        while()
                        if(val==arr[i]) {
                            st.pop();
                        }
                    }
                }
            }
        }
        System.out.print("[");
        for(int i  = 0  ;i<st.size()-1 ; i++){
            System.out.print(st.get(i)+",");
        }
        System.out.print(st.get(st.size()-1)+"]");
        sc.close();
    }
}