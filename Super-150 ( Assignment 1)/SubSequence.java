import java.util.Scanner;
public class SubSequence {
    public static int printsub(String s , String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char c = s.charAt(0);
        int a = printsub(s.substring(1),ans);
        int b = printsub(s.substring(1),ans+c);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("\n"+printsub(s,""));
    }
}
