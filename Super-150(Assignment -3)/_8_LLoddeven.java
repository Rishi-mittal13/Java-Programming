/*Sample Input
5
1 2 3 4 5
Sample Output
1 3 5 2 4 
 */
import java.util.*;
class ListNode{
    int val;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val =  val;
    }
}
public class _8_LLoddeven {
    public static ListNode modified(ListNode head){
        if(head==null || head.next==null)  return head ;
        ListNode ev = new ListNode(0);
        ListNode od =  new ListNode(0);
        ev.next = null;
        od.next =  null;
        ListNode evhead =  ev;
        ListNode odhead =  od;
        while(head!=null ){
           if(head.val%2==1){
            od.next =  head;
            head = head.next;
            od =  od.next ;
            od.next =  null;
           }
           else{
            ev.next = head;
            head = head.next ;
            ev =  ev.next ;
            ev.next = null;
           }
        }
        od.next = evhead.next ;
        return odhead.next ;
        // if(head!=null){
        //     ev.next =  head ;
        //     ev = ev.next ;
        //     ev.next =  null;
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode ll = new ListNode(0);
        ListNode head = ll;
        for(int i  = 0  ; i<n ; i++){
            int v =  sc.nextInt();
            ListNode l = new ListNode(v);
            ll.next =  l;
            ll = ll.next ;
        }
        ListNode ans = modified(head.next );
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans =  ans.next;
        }
        sc.close();
        
    }
    
}
