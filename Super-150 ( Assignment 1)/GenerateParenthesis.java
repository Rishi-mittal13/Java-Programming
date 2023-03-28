import java.util.Scanner;
public class GenerateParenthesis{
    static int count = 0;
    public static void generate(int n ,int close, int open, String ans){
        if(close==n && open==n){
            count++;
            System.out.println(ans+" ");
            return;
        }
        if(open<n){
        generate(n, close, open+1, ans+"(");}
        if((close<open) && (close<n)){
        generate(n, close+1, open, ans+")");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n, 0, 0, "");
        System.out.println(count);
        sc.close();
    }
}