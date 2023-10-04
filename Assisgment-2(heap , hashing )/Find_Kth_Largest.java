//Find kth Largest Number


import java.util.*;
public class Find_Kth_Largest {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int k  = sc.nextInt();
		PriorityQueue<Integer> mh = new PriorityQueue<>(new Comparator<Integer>(){
			public int compare(Integer a , Integer b) {
				return b - a ; 
			}
		});
		for(int i  = 0; i<n ; i++) mh.offer(sc.nextInt());
		for(int i = 0 ; i<k-1 ; i++){
			mh.poll();
		}
		System.out.println(mh.poll());
		sc.close();
    }
}
