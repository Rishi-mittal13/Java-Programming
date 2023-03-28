import java.util.Scanner;
public class DictionaryOrderL {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.next();
        int[] arr = new int[26];
        for(int i = 0; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }
        String ss = "";
        for(int i = 0 ;i<=25;i++){
            if(arr[i]!=0)
                ss = ss+(char)(i+'a');
        }
        dic_ord(ss,"",s);
    }
    public static void dic_ord(String s  , String ans , String p){
        if(s.length()==0){
            if(ans.compareTo(p)>0){
                System.out.println(ans);
            }
            return ;
        }
        for(int i = 0 ;i<s.length() ;i++){
            dic_ord(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i),p);
        }
    }
}
