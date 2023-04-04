import java.util.*;
public class _2_BalanceParanthesis{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			Stack<Character> stk = new Stack<>();
			for(int i = 0 ; i<s.length() ; i++){
				char c = s.charAt(i);
				if(c=='(') stk.push(')');
				else if(c=='{') stk.push('}');
				else if(c=='[') stk.push(']');
				else{
					if(stk.isEmpty() || (stk.pop()!=c)){
						System.out.println("No");
						return ;
					}
				}
			}
			if(stk.isEmpty()) System.out.println("Yes");
			else System.out.println("No");
			sc.close();
		}
	}
}