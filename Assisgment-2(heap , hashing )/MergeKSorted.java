//Merge K sorted Arrays



import java.util.*;
public class MergeKSorted {
    public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n =  sc.nextInt() ; 
		int k  = sc.nextInt() ; 
		int  d = n*k ; 
		int[]  ans  =  new int[d];
		for(int i  = 0 ; i<d ; i++){
			ans[i] =  sc.nextInt();
		}
		Arrays.sort(ans);
		for(int i  = 0;  i<d ; i++) System.out.print(ans[i]+ " ");
		sc.close();
    }
}