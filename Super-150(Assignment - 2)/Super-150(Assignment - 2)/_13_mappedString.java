import java.util.*;
public class _13_mappedString {
    static char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static void mapStr(String s , int ind , String ans ){
        if(ind == s.length()){
            System.out.println(ans);
            return ;
        }
        mapStr(s, ind+1, ans+arr[(Integer.parseInt(s.substring(ind, ind+1))-1)]);
        if(s.charAt(ind) == '0') return ;
        if(ind < s.length()-1 && (s.charAt(ind) == '1' || s.charAt(ind) == '2' && s.charAt(ind + 1) < '7'))
        {
            char c = arr[(Integer.parseInt(s.substring(ind, ind+2))-1)];
            mapStr(s, ind + 2,ans+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        mapStr(s,0,"");
        sc.close();
    }
}


