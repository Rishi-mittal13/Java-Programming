/*Sample Input
(())
Sample Output
Yes */

import java.util.*;
public class _15Balancedparanthesis {
    public static boolean vp(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(s.charAt(i)==')' && st.isEmpty()) return false;
            if(c=='(') st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else {
                if(c!=st.peek()) return false;
                st.pop();
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        boolean ans = vp(s);
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}
