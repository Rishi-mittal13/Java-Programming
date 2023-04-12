/*Sample Input
7
2 73
2 83
2 43
1
1
2 16
2 48
Sample Output
43
83 */
import java.util.*;
public class _7KartikAndCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<n ; i++){
            int q  = sc.nextInt();
            if(q==1){
                if(st.isEmpty()){ System.out.println("No Code");}
                else  System.out.println(st.pop());
            }
            if(q==2) {
                int val = sc.nextInt();
                st.push(val);
            }
        }
        sc.close();
    }
}
