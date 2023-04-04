/*7
push push push getMin pop top getMin
-2 0 -3    => // -3 0 -2  */

import java.util.*;
public class _5_minStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pushcount = 0;
        String[] str =new String[n];
        MinStack st = new MinStack();
        for(int i  = 0 ; i<n ; i++){
            str[i] = sc.next();
            if(str[i].equals("push")) pushcount++;
        }
        int[] parr = new int[pushcount];
        for(int i = 0 ; i<pushcount ; i++) parr[i] = sc.nextInt();
        int ind  = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(str[i].equals("push")) st.push(parr[ind++]);
            else if(str[i].equals("pop")) st.pop();
            else if(str[i].equals("top")) System.out.print(st.top() + " " );
            else if(str[i].equals("getMin")) System.out.print(st.getMin() + " " );
        }
        sc.close();
    }
}
class MinStack {
    int[] arr ;
    int [] min;
    int tos ;
    int tosmin ;
    public MinStack() {
        arr =  new int[10000];
        min = new int[10000];
        tos = -1;
        tosmin = -1;
    }
    public void push(int val) {
        tos++;
        tosmin++;
        arr[tos] = val ;
        if(tosmin==0) min[tosmin] = val;
        else{
        if(min[tosmin-1]<val) min[tosmin ] =  min[tosmin-1];
        else min[tosmin] = val;
        }
    }
    public void pop() {
        tosmin--;
        tos--;
    }
    public int top() {
        return arr[tos];
    }    
    public int getMin() {
        return min[tosmin];
    }
}
