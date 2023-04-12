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
public class _5playingWithCard {
    static ArrayList<Integer> lst = new ArrayList<>();
    public static void SeiveOfErr(){
        boolean[]  arr = new boolean[1000001];
        int max = 1000001;
        arr[0] =  true ; arr[1] =  true;
        for(int i = 2 ; i*i<max ; i++){
            if(arr[i]==false){
                for(int j = i ; j*i<max ; j++){
                    arr[j*i] =  true;
                }
            }
        }
        for(int i = 0 ;i<1000001 ; i++){
            if(arr[i] == false) lst.add(i);
        }
    }
    public static void main(String[] args) {
        SeiveOfErr();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st1 =  new Stack<>();
        Stack<Integer> st2 =  new Stack<>();
        Stack<Integer> st3 =  new Stack<>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0 ;i<n ; i++) st1.push(sc.nextInt());
        for(int i = 0 ; i<q  ;i++){
            int p = lst.get(i);
            while(!st1.isEmpty() && i%2==0){
                int val = st1.pop();
                if(val%p==0) st3.push(val);
                else st2.push(val);
            }
            while(!st2.isEmpty() && i%2==1){
                int val = st2.pop();
                if(val%p==0) st3.push(val);
                else st1.push(val);
            }
            while(!st3.isEmpty()) System.out.println(st3.pop());
        }
        while(!st2.isEmpty()) System.out.println(st2.pop());
        while(!st1.isEmpty()) System.out.println(st1.pop());
        sc.close();
    }
}
