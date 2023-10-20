//Subarrays with distinct elements 



import java.util.*;
public class SubArray_With_Distinct {
	static int mod  = 1000000007 ;
    public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<n ; i++) arr[i] = sc.nextInt();
		int j = 0 ,  s  = 0  ; 
		HashSet<Integer> hst =  new HashSet<>();
		for(int i  = 0 ; i<n ; i++){
			while(j<n && !hst.contains(arr[j])){
				hst.add(arr[j]) ; 
				j++;
			}
			s = (s +(j-i+1)*(j-i)/2) % mod  ;
			hst.remove(arr[i]);
		}
		System.out.println(s);
		sc.close();
    }
}