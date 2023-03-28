import java.util.Scanner;
public class recursionTwin {
    public static int printtwin(String s){
        if(s.length()<=2){
            return 0;
        }
        if(s.charAt(0)==s.charAt(2)){
            return 1+printtwin(s.substring(1));
        }
        else{
            return printtwin(s.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.next();
        System.out.println(printtwin(s));
    }
}
