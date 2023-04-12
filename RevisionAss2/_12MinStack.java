/*Sample Input
7
push push push getMin pop top getMin
-2 0 -3
Sample Output
-3 0 -2  */

import java.util.*;
public class _12MinStack{
    int[] st ;
    int[] minst;
    int tos;
    int mintos ;
    public _12MinStack(){
        st = new int[100001];
        minst = new int[100001];
        tos =  -1;
        mintos  =  -1;
    }
    public void push(int item){
        tos++;mintos++;
        st[tos] = item;
        if( mintos>0  && minst[mintos-1]<item) minst[mintos] =  minst[mintos-1];
        else if(mintos==0) minst[mintos] = item;
        else minst[mintos] =  item;
    }
    public void pop(){
        mintos--;
        tos--;
    }
    public int top(){
        return st[tos];
    }
    public int getMin(){
        return minst[mintos];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _12MinStack stk = new _12MinStack();
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i = 0 ;i<n ; i++) str[i] = sc.next();
        while(sc.hasNext())
        for(int i = 0 ; i<n ; i++){
            if(str[i].equals("push")){
                int val = sc.nextInt();
                stk.push(val);
            }
            else if(str[i].equals("pop")) stk.pop() ;
            else if(str[i].equals("getMin")) System.out.print(stk.getMin()+" ");
            else if(str[i].equals("top")) System.out.print(stk.top()+" ");
        }

        
    }
}