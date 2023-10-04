//Frequent Elements in Array


import java.util.*;
public class frequent_element_array {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer , Integer> hm = new TreeMap<>();
		for(int i  = 0 ; i<n ; i++){
			int data = sc.nextInt();
			hm.put(data ,  hm.getOrDefault(data , 0 )+1);
		}
		PriorityQueue<Integer> pq =  new PriorityQueue<>(new Comparator<Integer>(){
			public int compare(Integer a , Integer b){
				if(hm.get(b)== hm.get(a)) return b - a ; 
				else return  hm.get(b) - hm.get(a) ; 
			}
		});
		for(Integer e : hm.keySet()) pq.offer(e) ; 
		ArrayList<Integer> arr =  new ArrayList<>();
		for(int i = 0 ; i<k ; i++) arr.add(pq.poll());
		Collections.sort(arr);
		for(Integer e : arr) System.out.print(e + " "); 
		sc.close();
    }
}