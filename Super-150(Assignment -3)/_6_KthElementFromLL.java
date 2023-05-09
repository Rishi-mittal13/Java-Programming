/*Sample Input
1 2 3 4 5 6 -1
3
Sample Output
4 */
import java.util.*;
class ListNode{
    int val ;
    ListNode next ;
    ListNode(){}
    ListNode(int val){this.val = val;}
}
public class _6_KthElementFromLL {
    public static int kthelem(ListNode head , int k){
        ListNode h1 = head;
        ListNode h2 =  head;
        for(int i  = 0 ; i<k ; i++) h1 =  h1.next;
        while(h1!=null){
            h1 = h1.next;
            h2 = h2.next;
        }
        return h2.val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        ListNode ll = new ListNode(v);
        ListNode head = ll;
        while(v!=-1){
            v = sc.nextInt();
            if(v==-1) break;
            ListNode n = new ListNode(v);
            ll.next =  n;
            ll = ll.next;
        }
        int k = sc.nextInt();
        System.out.println(kthelem(head,k));
        sc.close();
    }
}
