/*Sample Input
4 2
1 2 3 4
Sample Output
1 2 4 */
import java.util.*;
class ListNode{
    int val;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class _13_RemoveKthNodeFromEnd{
    public static ListNode Modified(ListNode head , int k){
        ListNode temp = head;
        ListNode temp2 =  head;
        for(int i = 0 ;i<k; i++) temp = temp.next ;
        if(temp == null ) return head.next;
        while(temp.next!=null){
            temp  =  temp.next ;
            temp2 =  temp2.next;
        }
        temp2.next =  temp2.next.next ;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k =  sc.nextInt();
        ListNode ll = new ListNode(0);
        ListNode head = ll;
        for(int  i = 0 ; i<n ; i++){
            int v =  sc.nextInt();
            ListNode l  = new ListNode(v);
            ll.next = l;
            ll  = ll.next ;
        }
        ListNode ans = Modified(head.next , k);
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}