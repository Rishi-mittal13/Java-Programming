/*Sample Input
5 1
3 4 7 6 5
Sample Output
4
6
3
7
5 */

import java.util.*;
public class Test{
    static ArrayList<Integer> prime = new ArrayList<>();
    public static void primeSieve(){
        boolean[] ar = new boolean[1000001];
        ar[0] = true ; ar[1] = true;
        for(int i = 2 ; i*i<1000001 ; i++){
            if(ar[i]==false){
                for(int j = i  ; j*i<1000001 ; j++) ar[j*i] = true;
            }
        }
        for(int i  = 0 ; i<1000001 ; i++){
            if(ar[i]==false) prime.add(i);
        }
    }
    public static void main(String[] args) {
        primeSieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q =  sc.nextInt();
        Stack<Integer> st1 =  new Stack<>();
        Stack<Integer> st2 =  new Stack<>();
        Stack<Integer> st3 =  new Stack<>();
        for(int i = 0 ; i<n ; i++) st1.push(sc.nextInt());
        for(int i =  0 ;i<q ; i++){
            int p = prime.get(i);
            while(!st1.isEmpty() && i%2==0){
                if(st1.peek()%p==0) st3.push(st1.pop());
                else st2.push(st1.pop());
            }
            while(!st2.isEmpty() && i%2==1){
                if(st2.peek()%p==0) st3.push(st1.pop());
                else st1.push(st2.pop());
            }
            while(!st3.isEmpty()) System.out.println(st3.pop());
        }
        while(!st1.isEmpty()) System.out.println(st1.pop());
        while(!st2.isEmpty()) System.out.println(st2.pop());
    }
}