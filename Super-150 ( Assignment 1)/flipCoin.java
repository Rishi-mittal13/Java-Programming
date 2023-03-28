//
import java.util.*;
public class flipCoin {
    public static void print(int nc , int c , String ans){
        if(c==nc){
            System.out.println(ans);
            return;
        }
        print(nc,c+1,ans+"H");
        print(nc,c+1,ans+"T");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();
        print(nc,0,"");
        sc.close();
    }
    
}
