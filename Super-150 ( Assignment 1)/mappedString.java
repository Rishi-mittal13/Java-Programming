import java.util.Scanner;
public class mappedString {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.next();
        map_str(s," ");
    }
    public static void map_str(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        int c = Integer.parseInt(s.substring(0,1)) + 64;
        map_str(s.substring(1), ans+(char)c);
        if(s.length()>1){
            int a = Integer.parseInt(s.substring(0,2));
            if(a<=26){
                map_str(s.substring(2),ans+(char)(a+64));
            }
        }
    }
}
