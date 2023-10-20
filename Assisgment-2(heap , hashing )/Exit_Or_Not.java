//Exist OR Not


import java.util.*;
public class Exit_Or_Not {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j = 0 ; j<t ; j++){
			HashSet<Integer> hs =  new HashSet<>();
			int n =  sc.nextInt();
			for(int i = 0 ; i<n ; i++) hs.add(sc.nextInt());
			int q =  sc.nextInt();
			for(int i = 0;  i<q ; i++){
				int data = sc.nextInt();
				if(hs.contains(data)) System.out.println("Yes");
				else System.out.println("No");
			}
		}
		sc.close();
    }
}