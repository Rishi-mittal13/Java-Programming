/*Sample Input
7
1 2 2 1 8 5 6
3
Sample Output
8 5 6 1 2 2 1
 */
import java.util.*;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class _7_LinkedListKappend{
    public static ListNode modified(ListNode head , int k , int n ){
        ListNode temp = head ;
        ListNode join =  head;
        k =  k % n ;
        if(k==0 || n<=1) return head;
        for(int i = 0 ; i<k ; i++) {temp =  temp.next ;}
        while(temp.next != null) {
            join = join.next ;
            temp = temp.next ;
        }
        ListNode h1  = join.next;
        join.next =  null;
        temp =  h1;
        while(temp!=null && temp.next!=null)  temp =  temp.next ;
        temp.next =  head;
        return h1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode ll = new ListNode(0);
        ListNode head =  ll;
        for(int i = 0 ;  i<n ; i++){
            ListNode l = new ListNode(sc.nextInt());
            ll.next = l;
            ll = ll.next ;
        }
        int k = sc.nextInt();
        ListNode ans =  modified(head.next , k , n );
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans =  ans.next;
        }
        sc.close();
    }
}