//string sort 

import java.util.*;
public class string_sort {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str  = new String[n];
		for(int i = 0 ; i<n ; i++) str[i] = sc.next();
		Arrays.sort(str ,  new Comparator<String>(){
		public  int  compare(String a, String b) {
        if (a.length() <= b.length() && b.substring(0, a.length()).equals(a))
            return +1;
        else if (b.length() <= a.length() && a.substring(0, b.length()).equals(b))
            return -1;
        else
            return a.compareTo(b);
    }
		});
		for(int i = 0;  i<n ; i++) System.out.println(str[i]);
		sc.close();
    } 
}
