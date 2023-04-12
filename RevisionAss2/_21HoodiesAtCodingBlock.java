/*Sample Input
5
E 1 1
E 2 1
E 1 2
D
D
Sample Output
1 1
1 2 */


import java.util.*;
public class _21HoodiesAtCodingBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        Deque<Integer> dq3 = new ArrayDeque<>();
        Deque<Integer> dq4 = new ArrayDeque<>();
        Deque<Integer> course = new ArrayDeque<>();
        for(int i  = 0 ;i<n  ;i++){
            String s =  sc.next();
            if(s.equals("E")){
                int a = sc.nextInt();
                int b =  sc.nextInt();
                if(a==1){
                    if(dq1.isEmpty()) course.addLast(1);
                    dq1.addLast(b);
                }
                else if(a==2){
                    if(dq2.isEmpty()) course.addLast(2);
                    dq2.addLast(b);
                }
                else if (a==3){
                    if(dq3.isEmpty()) course.addLast(3);
                    dq3.addLast(3);
                }
                else{
                    if(dq4.isEmpty()) course.addLast(4);
                    dq4.addLast(b);
                }
            }
            else{
                int c =  course.getFirst();
                if(c==1) {
                    int elm = dq1.pollFirst();
                    System.out.println(c +" " + elm);
                    if(dq1.isEmpty()) course.pollFirst();
                } 
                else if(c==2) {
                    int elm = dq2.pollFirst();
                    System.out.println(c +" " + elm);
                    if(dq2.isEmpty()) course.pollFirst();
                } 
                else if(c==3) {
                    int elm = dq3.pollFirst();
                    System.out.println(c +" " + elm);
                    if(dq3.isEmpty()) course.pollFirst();
                } 
                else if(c==4) {
                    int elm = dq4.pollFirst();
                    System.out.println(c +" " + elm);
                    if(dq4.isEmpty()) course.pollFirst();
                } 
            }
        }
    }
}
