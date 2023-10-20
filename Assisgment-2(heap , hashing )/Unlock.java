//Unlock

import java.util.*;
public class Unlock {
    public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n  = sc.nextInt() ; 
		int  k  = sc.nextInt() ; 
		int[] arr = new int[n]; 
		int[] ind = new int[n+1];
		for(int i = 0 ; i<n  ; i++){
			arr[i] = sc.nextInt();
			ind[arr[i]] =  i ;
		}		
		int count =  0 ; 
		for(int i  = 0 ; i<n ; i++){
			if(arr[i]!=n-i){
				int t2 = ind[n-i];
				int t3 = arr[i];
				arr[t2] = t3 ; 
				arr[i] = n-i ;
				ind[n-i] = i ;
				ind[t3] = t2 ;
				count++;
			}
			if(count==k) break ;
		}
		for(int i  = 0 ; i<n ; i++) System.out.print(arr[i] + " ");
		sc.close();
    }
}