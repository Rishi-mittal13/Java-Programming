/*Sample Input
8
12 15 10 11 5 6 2 3
Sample Output
15 11 6 3  */

import java.util.*;
class ListNode {
    int val;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val  = val;
    }
}
public class _9_deletNodes {
    public static ListNode reverse(ListNode head){
        ListNode prev =  null;
        ListNode curr =  head ;
        ListNode next = null;
        while(head!=null){
            next = head.next ;
            curr = head;
            curr.next =  prev ;
            prev = curr;
            head =  next;
        }
        return prev;
    }
    public static ListNode modified(ListNode head){
        Stack<ListNode> st = new Stack<>();
        while(head!=null){
            while(!st.isEmpty() && (head.val>st.peek().val)) st.pop();
            st.push(head);
            head =  head.next;
        }
        ListNode temp =  st.pop();
        ListNode ans = temp;
        while(!st.isEmpty()){
            temp.next =  st.pop();
            temp = temp.next;
        }
        temp.next = null;
        return reverse(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        ListNode ll = new ListNode(0);
        ListNode head = ll;
        for(int i  = 0 ; i<n ; i++){
            int v =  sc.nextInt();
            ListNode l = new ListNode(v);
            ll.next =  l;
            ll = ll.next;
        }
        ListNode ans =  modified(head.next);
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans =  ans.next;
        }
        sc.close();
    }
}
