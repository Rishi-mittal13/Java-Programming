import java.util.ArrayList;

import java.util.*;
public class breakString {
    public static void main(String[] args) {
        String que = "abc";
        String ans = "";
        List<String> ll = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        partioning(que,ll,res);
        System.out.println(res);
    }
    public static void partioning(String que , List<String> ll,List<List<String>> res){
        if(que.length()==0){
            System.out.println(new ArrayList<>(ll));
            res.add(ll);
            return ;
        }
        for(int i = 1 ; i<=que.length() ; i++){
            String part = que.substring(0, i);
            if(isPalindrome(part)){
            ll.add(part);
            partioning(que.substring(i), ll, res);
            ll.remove(ll.size()-1);
        }
        }
    }
    public static boolean isPalindrome(String part){
        int i = 0 ;
        int end = part.length()-1;
        while(i<end){
            if(part.charAt(i++)!=part.charAt(end--)) return false;
        }
        return true;
    }
}
