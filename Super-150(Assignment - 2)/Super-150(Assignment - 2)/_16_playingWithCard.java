/*5 1
3 4 7 6 5  
// output
4
6
3
7
5 */
import java.util.*;
public class _16_playingWithCard {
    static int maxsize = 100001;
    static ArrayList<Integer> prime = new ArrayList<>();
    public static void nthprime(){
        boolean[] isprime = new boolean[maxsize];
        for(int j = 2 ; (j*j)<maxsize ; j++){
            if(isprime[j]==false){
            for(int i = j ; i*j<maxsize ; i++){
                isprime[i*j] = true;
            }
        }
        }
        for(int i = 2 ; i<100001 ; i++){
            if(isprime[i]==false) prime.add(i);
        }
        //System.out.println(prime.get(0));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nthprime();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        int n  = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            int elm = sc.nextInt();
            st1.push(elm);
        }
        for(int i = 0 ;i<q ; i++){
            int p = prime.get(i);
            while((!st1.isEmpty()) && (i%2==0)){
                if(st1.peek()%p==0) st2.push(st1.pop());
                else st3.push(st1.pop());
            }    
            while((!st3.isEmpty()) && (i%2==1)){
                if(st3.peek()%p==0) st2.push(st3.pop());
                else st1.push(st3.pop());
            }
            while(!st2.isEmpty()) System.out.println(st2.pop());
        }
        while(!st1.isEmpty()) System.out.println(st1.pop());
        while(!st3.isEmpty()) System.out.println(st3.pop());
    }
}



//