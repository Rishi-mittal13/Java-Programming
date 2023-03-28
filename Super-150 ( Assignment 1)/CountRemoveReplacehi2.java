import java.util.Scanner;
public class CountRemoveReplacehi2 {
    public static int rem_rep(String s, String ans,  String ans1 , int i){
        if(s.length()==0){
            System.out.println(i);
            System.out.println(ans);
            System.out.println(ans1);
            return i;
        }
        if(s.length()>2 && "hit".equals(s.substring(0,3))){
            return rem_rep(s.substring(1),ans+"h",ans1+"h",i);
        }
        if(s.length()>1&&("hi".equals(s.substring(0,2)))){
            return rem_rep(s.substring(2),ans,ans1+"bye",i+1);
        }
        else{
            return rem_rep(s.substring(1),ans+s.charAt(0),ans1+s.charAt(0),i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        rem_rep(s,"","",0);
        sc.close();
}
}