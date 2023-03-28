/*Take as input str, a string.
a).Write a recursive function which counts the number of times ‘hi’ appears in the string. 
Print the value returned. 
b).Write a recursive function which removes all ‘hi’ in the string. Print the value returned. 
c).Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. Print the value returned. */

import java.util.Scanner;
public class CountRemoveReplacehi{
    public static int rem_rep(String s, String ans,  String ans1 , int i){
        if(s.length()==0){
            System.out.println(i);
            System.out.println(ans);
            System.out.println(ans1);
            return i;
        }
        if(s.length()>1&&"hi".equals(s.substring(0,2))){
            return rem_rep(s.substring(2),ans,ans1+"bye",i+1);
        }
        else{
            return rem_rep(s.substring(1),ans+s.charAt(0),ans1+s.charAt(0),i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        rem_rep(s,"","",0);
        sc.close();
    }
}