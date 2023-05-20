/*Sample Input
1
4
1 3 5 7
3
2 4 6
Sample Output
1 2 3 4 5 6 7  */
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
public class _14_MergeTwoSortedList {
    public static ListNode merge(ListNode l1 , ListNode l2){
        ListNode head =  new ListNode(0);
        ListNode temp  = head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val) {
                ListNode h = new ListNode(l1.val);
                temp.next =  h;
                l1 = l1.next ;
            }
            else {
                ListNode h = new ListNode(l2.val);
                temp.next =  h;
                l2 = l2.next;
            }
            temp =  temp.next ;
        }
        if(l1!=null){
            temp.next = l1;
        }
        if(l2!=null){
            temp.next  = l2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int  i  = 0 ; i<t ;  i++){
            int n1 =  sc.nextInt();
            ListNode l1 = new ListNode(0);
            ListNode h1 =  l1;
            for(int j  = 0 ; j<n1 ; j++){
                int v =  sc.nextInt();
                ListNode temp  =  new ListNode(v);
                l1.next =  temp;
                l1 =  l1.next;
            }
            int n2 =  sc.nextInt();
            ListNode l2 =  new ListNode(0);
            ListNode h2 =  l2 ;
            for(int j = 0  ; j<n2 ; j++){
                int v =  sc.nextInt();
                ListNode temp  =  new ListNode(v);
                l2.next =  temp;
                l2 =  l2.next;
            }
            ListNode ans =  merge(h1.next ,h2.next);
            while(ans!=null){
                System.out.print(ans.val + " ");
                ans =  ans.next ;
            }
        }
    }
}
