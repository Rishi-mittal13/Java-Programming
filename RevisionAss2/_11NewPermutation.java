/*Sample Input
3z4
Sample Output
3z4 3Z4 */



import java.util.*;
public class _11NewPermutation {
    public static void printprm(String s , int i , String ans){
        if(i==s.length()){
            System.out.print(ans+" ");
            return ;
        }
        if(Character.isAlphabetic(s.charAt(i))){
            printprm(s, i+1, ans+Character.toLowerCase(s.charAt(i)));
            printprm(s, i+1, ans+Character.toUpperCase(s.charAt(i)));
        }
        else{
        printprm(s, i+1, ans+s.charAt(i));}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printprm(s,0,"");
        sc.close();
    }
}
