/*Sample Input
12
Sample Output
.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c */

import java.util.*;
public class _22SmartKeypad {
    static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void printKey(String s , int idx , String ans){
        if(s.length()<=0) {
            System.out.println(ans);
            return ;
        }
        String word = table[s.charAt(0)-'0'];
        for(int i = 0  ;i<word.length() ; i++){
            printKey(s.substring(1) , i+1 , ans+word.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String  digit =  sc.next();
        printKey(digit , 0 , "");
        sc.close();
    }
}
