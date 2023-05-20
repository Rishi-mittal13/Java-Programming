/*Sample Input
9 3
9 4 1 7 8 3 2 6 5
Sample Output
1 4 9 3 8 7 5 6 2
 */
import java.util.*;
class ListNode{
    int val ;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val  = val ;
    }
}
public class _20LinkList_K_Reverse {
    public static ListNode ReverseK(ListNode head , int n , int k){
        if(k<=1 ||  head == null ||  head.next == null)  return head ;
        int count = n/k;
        ListNode lst = new ListNode(0);
        ListNode temp =  head ,  ans =  lst ;
        while(count>0){
            ListNode prev = null , curr = null , next =  null ;
            int c = k;
            while(c>0){
                next = temp.next ;
                curr =  temp ;
                temp.next = null;
                curr.next = prev ;
                prev =  curr ;
                temp =  next ;
                c--;
            }
            lst.next = prev ;
            while(lst.next!=null)  lst =  lst.next ;
            count--;
        }
        lst.next =  temp ;
        return ans.next ;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt() , k = sc.nextInt();
        ListNode l1 = new ListNode(0) , head =  l1;
        for(int i  = 0 ; i<n ; i++){
            ListNode node = new ListNode(sc.nextInt());
            l1.next = node;
            l1 =  l1.next ;
        }
        ListNode ans =  ReverseK(head.next , n , k);
        while(ans!=null) { System.out.print(ans.val + " "); ans =  ans.next ; }
        sc.close();
    }
}
