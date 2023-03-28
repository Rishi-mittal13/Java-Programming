import java.util.*;
public class _10_reverseBuRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st =  new Stack<>();
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int ele = sc.nextInt();
            st.push(ele);
        }
        reverse(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        sc.close();
    }	
    public static void insertD(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return ;
        }
        int x = st.pop();
        insertD(st, data);
        st.push(x);
    }	
    public static void reverse(Stack<Integer> st ){
        if(st.isEmpty()) return ;
        int d = st.pop();
        reverse(st);
        insertD(st, d);
    }

}
