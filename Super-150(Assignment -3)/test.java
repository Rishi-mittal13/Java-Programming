
import java.util.*;
class ListNode{
    int val ;
    ListNode next ;
    ListNode(){}
    ListNode(int val){
        this.val =  val ;
        next =  null ;
    }
    ListNode(int val , ListNode next ){
        this.val =  val ;
        this.next =  next ;
    }
}
public class test {
    public static int getLength(ListNode l) {
        if (l==null)return 0;
        return getLength(l.next)+1;
    }
    
    public static ListNode add(ListNode a, ListNode b, int offset) {
        if (a==null && b==null) 
            return new ListNode();
        ListNode sum;
        if (offset>0) 
            sum = add(a.next, b, offset-1);
        else 
            sum = add(a.next, b.next, 0);
        if (a.val==-1 && b.val==-1) return sum;
        sum.val += (a.val==-1)?0:a.val;
        sum.val += (b.val==-1)?0:b.val;
        ListNode next = new ListNode(sum.val/10, sum);
        sum.val=sum.val%10;
        return next;
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getLength(l1), len2 = getLength(l2);
        ListNode zero1 = new ListNode(-1, l1);
        ListNode zero2 = new ListNode(-1, l2);
        ListNode sum;
        if (len1>=len2)
            sum = add(zero1, zero2, (len1-len2));
        else
            sum = add(zero2, zero1, (len2-len1));
        return (sum.val==0)?sum.next:sum;
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
        ListNode ans =  addTwoNumbers(h1.next , h2.next );
        while(ans!=null){System.out.print(ans.val  + " "); ans = ans.next ;}
        sc.close();
    }
}