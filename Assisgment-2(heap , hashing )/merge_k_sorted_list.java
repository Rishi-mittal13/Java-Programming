//merge k sorted list . 

import java.util.*;
class ListNode{
	ListNode next ; 
	int val ;
	public ListNode(int val ){
		this.val = val ; 
	}

}
public class merge_k_sorted_list {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ListNode[] arr =  new ListNode[n];
		for(int i = 0 ; i<n ; i++){
			ListNode l = new ListNode(sc.nextInt());
			ListNode temp = l ;
			for(int j = 0; j<k-1 ; j++){
				temp.next = new ListNode(sc.nextInt());
				temp  =  temp.next ; 
			}
			arr[i] =  l ; 
		}
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
			public int compare(ListNode l1 , ListNode l2){
				return l1.val - l2.val ;
			}
		});
		ListNode ans =  new ListNode(0);
		ListNode temp =  ans ;  
		for(int i = 0 ; i<n ; i++) pq.offer(arr[i]);
		while(!pq.isEmpty()){
			ListNode lnode =  pq.poll();
			temp.next = lnode ; 
			temp = temp.next ; 
			if(lnode.next!=null) pq.offer(lnode.next);
		}
		ans =  ans.next ; 
		while(ans!=null) {
			System.out.print(ans.val + " ");
			ans =  ans.next ; 
		}
		sc.close();
    }
}