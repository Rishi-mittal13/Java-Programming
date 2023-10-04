//Arrays-Intersection Of Two Arrays

import java.util.*;
public class Intersection_Of_two_Array {
    public static void main(String args[]) {
        Map<Integer , Integer> hm =  new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a1 =  new int[n]; 
		int[] a2 =  new int[n];
		for(int i = 0 ; i<n ; i++) a1[i] = sc.nextInt();
		for(int i = 0 ; i<n ; i++) a2[i] = sc.nextInt();
		for(int i = 0 ; i<n ; i++){
			hm.put(a1[i] , hm.getOrDefault(a1[i] ,  0) +1);
		}
		List<Integer> ans = new ArrayList<>();
		for(int i = 0 ; i<n ; i++){
			if(hm.containsKey(a2[i]) && hm.get(a2[i])>0){
				ans.add(a2[i]);
				hm.put(a2[i] , hm.get(a2[i])-1);
			}
		}
		Collections.sort(ans);
		System.out.println(ans);
		sc.close();
    }
}