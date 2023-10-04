// mapped string 

import java.util.*;
public class mapped_String {
	static char[] arr = {'A'  , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K',
	'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' };
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
		int a   =  sc.nextInt() ; 
		find(a+"" , "");
        sc.close();
    }
	public static void find(String s  , String ans){
		if(s.length()==0){
			System.out.println(ans);
			return  ;
		}
		int a = Integer.parseInt(s.substring(0,1));
		find(s.substring(1 , s.length()) , ans + arr[a-1]) ; 
		if(s.length()>1) { 
			int b =  Integer.parseInt(s.substring(0 , 2));
			if(b<=26){
				find(s.substring(2 , s.length()) , ans + arr[b-1]);
			}
		}
	}
}