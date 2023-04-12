import java.util.Scanner;

/*Sample Input
123
Sample Output
ABC
AW
LC */

public class _13mappedString{
    public static void mapstr(String s , int i , String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        mapstr(s,i+1,ans+(char)(Integer.parseInt(s.substring(i,i+1))+64));
        if(i<s.length()-1 && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<'7')){
            char c = (char)(Integer.parseInt(s.substring(i, i+2))+64);
            mapstr(s, i+2, ans+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        mapstr(s , 0 , "");
    }
}