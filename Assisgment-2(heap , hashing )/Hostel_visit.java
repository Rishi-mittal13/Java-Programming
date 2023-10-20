//Hostel visit . 

import java.util.*;
public class Hostel_visit {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Long q  = sc.nextLong(); 
		Long k =  sc.nextLong(); 
		PriorityQueue<Long> pq =  new PriorityQueue<>(new Comparator<Long>(){
			public int compare(Long a  , Long b){
				if(a>b) return -1 ; 
				else if(a<b) return 1 ;
				else return 0 ;

			}
		});
		for(int i  = 0 ; i<q ; i++){
			Long a  = sc.nextLong(); 
			if(a==1){
				Long x = sc.nextLong();
				Long y = sc.nextLong();
				Long data = x*x + y*y ; 
				if(pq.size()<k) pq.offer(data) ;
				else if(data<pq.peek())
				{
					pq.poll();
					pq.offer(data);
				}
			}
			else  System.out.println(pq.peek());
		}
		sc.close();
    }
}
