//3z4 // 3z4 3Z4
import java.util.*;
public class _19_newPermutation {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        genStr(s, "", 0);
        sc.close();        
    }
    public static void genStr(String input, String ans, int idx) {
        // Base case.
        if (idx == input.length()) {
            System.out.print(ans+" ");
            return;
        }
        if (Character.isLetter(input.charAt(idx))) {
            genStr(input, ans+Character.toLowerCase(input.charAt(idx)), idx+1);
            genStr(input, ans+Character.toUpperCase(input.charAt(idx)), idx+1);
        }
        // for digit.
        else {
            genStr(input, ans+input.charAt(idx), idx+1);
        }
    }
}
