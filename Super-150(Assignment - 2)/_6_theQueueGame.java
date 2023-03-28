import java.util.*;
public class _6_theQueueGame {
    public static String TQG(int[] arr , int  n ){
        Stack<Integer> st = new Stack<>();
        if(arr[0] ==  0) return "Invalid";
        for(int i = 0 ; i<n ; i++){
            if(arr[i]==1) st.push(1);
            else if(st.isEmpty() && arr[i]==0) return "Invalid";
            else st.pop();
        }
        return "Valid";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(TQG(arr,n));
        }
        sc.close();
    }
}
