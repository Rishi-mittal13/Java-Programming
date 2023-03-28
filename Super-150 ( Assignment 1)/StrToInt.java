import java.util.Scanner;
public class StrToInt {
    public static void sti(String s,int n,int ans){
        if(n==s.length()){
            System.out.println(ans);
            return ;      
        }
        ans = ans*10 + ((int)s.charAt(n)-48);
        sti(s, n+1, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sti(s,0,0);
        sc.close();
    }
}
