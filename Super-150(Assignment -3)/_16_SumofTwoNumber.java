/*Sample Input
3 3
5 6 3
8 4 2
Sample Output
1 4 0 5 */

import java.util.*;
class ListNode{
    int val ;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next =  null;
    }
}
public class _16_SumofTwoNumber {
    public static ListNode AddTwo(ListNode l1 , ListNode l2){
        ListNode ls1 = reverse(l1);
        ListNode ls2 = reverse(l2);
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int c = 0 ;
        while(ls1!=null && ls2!=null){
            int s =  ls1.val +  ls2.val +c ;
            if(s>9) {
                ListNode node =  new ListNode(s-10);
                c= 1;
                ans.next =  node;
            }
            else {
                ListNode node =  new ListNode(s);
                c= 0;
                ans.next = node ;
            }
            ans =  ans.next;
            ls1 =  ls1.next ;
            ls2 =  ls2.next ;
        }
        while(ls1!=null){
            int s =  ls1.val +  c;
            if(s>9) {
                ListNode node =  new ListNode(s-10);
                c= 1;
                ans.next =  node;
            }
            else {
                ListNode node =  new ListNode(s);
                c= 0;
                ans.next = node ;
            }
            ls1 =  ls1.next;
            ans =  ans.next;
        }
        while(ls2!=null){
            int s =  ls2.val +  c;
            if(s>9) {
                ListNode node =  new ListNode(s-10);
                c= 1;
                ans.next =  node;
            }
            else {
                ListNode node =  new ListNode(s);
                c= 0;
                ans.next = node ;
            }
            ls2 =  ls2.next;
            ans =  ans.next;
        }
        if(c==1){
            ListNode node = new ListNode(1);
            ans.next =  node;
            ans =  ans.next;
        }
        return reverse(head.next);
    }
    public static ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode curr =  l;
        ListNode next =  null;
        while(curr!=null){
            next =  curr.next ;
            curr.next = null;
            curr.next = prev ;
            prev =  curr;
            curr = next ;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =  sc.nextInt() , n2  = sc.nextInt();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode h1 = l1;
        ListNode h2 = l2;
        for(int i  = 0 ; i<n1 ;i++){
            ListNode node = new ListNode(sc.nextInt());
            l1.next = node ;
            l1 = l1.next ;
        }
        for(int i = 0 ; i<n2 ; i++){
            ListNode node = new ListNode(sc.nextInt());
            l2.next = node ;
            l2 = l2.next ;
        }
        ListNode ans =  AddTwo(h1,h2);
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        sc.close();
    }
}