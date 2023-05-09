/*Sample Input
3 3 3
12 6 29
23 5 8
90 20 59
101
Sample Output
6 5 90 */

import java.util.*;
class ListNode{
    int val ;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val =  val;
        this.next = null;
    }
}
public class _15_TripletFromThreeLinkedList {
    public static void printResult(ListNode list1 , ListNode list2 , ListNode list3 , int sum){
        ListNode l1 =  list1 , l2 = list2 , l3 =  list3;
        while(l1!=null){
            int v1 = l1.val;
            while(l2!=null){
                int v2 =  l2.val;
                while(l3!=null){
                    int v3 =  l3.val;
                    if((v1+v2+v3)==sum){
                        System.out.print(v1 +" " +v2 +" " + v3);
                        return ;
                    }
                    l3 =  l3.next ;
                }
                l2 =  l2.next ;
                l3 =  list3;
            }
            l2 =list2;
            l1 =  l1.next;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt() ,  n2 = sc.nextInt()  ,  n3 = sc.nextInt() ;
        ListNode l1 = new  ListNode(0);
        ListNode l2 = new  ListNode(0);
        ListNode l3 = new  ListNode(0);
        ListNode h1 = l1 ,  h2 = l2 , h3 = l3 ;
        for(int i = 0 ;i<n1 ; i++){
            ListNode temp = new ListNode(sc.nextInt());
            l1.next =  temp;
            l1 =  l1.next ;
        }
        for(int i = 0 ;i<n2 ; i++){
            ListNode temp = new ListNode(sc.nextInt());
            l2.next =  temp;
            l2 =  l2.next ;
        }
        for(int i = 0 ;i<n3 ; i++){
            ListNode temp = new ListNode(sc.nextInt());
            l3.next =  temp;
            l3 =  l3.next ;
        }
        int sum = sc.nextInt();
        printResult(h1.next , h2.next , h3.next , sum);
        sc.close();
    }
}
