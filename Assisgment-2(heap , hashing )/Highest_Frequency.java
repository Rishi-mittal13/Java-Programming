//Highest frequency( Hashing )



import java.util.*;
public class Highest_Frequency {
    public static void main (String args[]) {
		HashMap<Integer , Integer> hm = new HashMap<>();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n ; i++){
			int a =  sc.nextInt();
			hm.put(a , hm.getOrDefault(a ,  0)+1) ;
		}
		int num = 0 , m = 0 ; 
		for(Integer e : hm.keySet()){
			if(hm.get(e)>m){
				num =  e ; 
				m = hm.get(e);
			}
		}
		System.out.println(num);
		sc.close();
    }
}