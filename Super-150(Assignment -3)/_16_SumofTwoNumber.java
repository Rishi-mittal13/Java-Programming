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
        ListNode temp1 =  reverse(l1) ,  temp2 =  reverse(l2);
        ListNode temp  = new ListNode(0) , ans =  temp ;
        int c =   0 ;
        while(temp1!=null && temp2!=null){
            int v =  temp1.val + temp2.val + c;
            if(v>9){
                v = v - 10;
                c = 1;
            }
            else c = 0;
            ListNode node = new ListNode(v);
            temp.next =  node;
            temp =  temp.next ;
            temp1 =  temp1.next ;
            temp2 =  temp2.next ;
        }
        while(temp1!=null){
            int v = temp1.val+c;
            if(v>9){
                v = v - 10;
                c = 1;
            }
            else c = 0;
            ListNode node =  new ListNode(v);
            temp.next =  node;
            temp =  temp.next ;
            temp1 =  temp1.next ;
        }
        
        while(temp2!=null){
            int v = temp2.val+c;
            if(v>9){
                v = v - 10;
                c = 1;
            }
            else c = 0;
            ListNode node =  new ListNode(v);
            temp.next =  node;
            temp =  temp.next ;
            temp2 =  temp2.next ;
        }
        if(c==1){
            ListNode node =  new ListNode(1);
            temp.next =  node;
            temp =  temp.next ;
        }
        ans =  reverse(ans.next );
        return ans;
    }
    public static ListNode reverse(ListNode head ){
        ListNode prev =  null , curr = null , next =  null;
        while(head!=null){
            next =  head.next ;
            curr =  head ;
            head.next =  null; 
            curr.next =  prev ;
            prev = curr ;
            head = next ;
        }
        return prev ;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt() , n2 =  sc.nextInt();
        ListNode lst1 = new ListNode(0);
        ListNode lst2 =  new ListNode(0);
        ListNode h1 =  lst1 , h2 =  lst2 ;
        for(int i = 0 ;i<n1 ; i++){
            int  v =  sc.nextInt();
            ListNode node =  new ListNode(v);
            lst1.next =  node ; lst1 =  lst1.next ;
        }
        for(int i = 0 ;i<n2 ; i++){
            int  v =  sc.nextInt();
            ListNode node =  new ListNode(v);
            lst2.next =  node ; lst2 =  lst2.next ;
        }
        ListNode ans =  AddTwo(h1.next , h2.next );
        while(ans!=null){System.out.print(ans.val  + " "); ans = ans.next ;}
        sc.close();
    }
}