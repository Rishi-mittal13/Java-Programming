import java.util.*;
class _8_smartkeypad {
    static String[] arr = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ll = new ArrayList<String>();
        printDigit(str,"",ll);
        for(int i = 0 ; i<ll.size() ; i++){
            System.out.println(ll.get(i));
        }
        sc.close();  
    }
public static void printDigit(String str , String ans , ArrayList<String> ll){
    if(str.length() == 0){
        ll.add(ans);
        return ;
    }
    char c =  str.charAt(0);
    String press = arr[c-'0'];
    for(int i = 0 ; i<press.length();i++){
        printDigit(str.substring(1),ans+press.charAt(i),ll);
    }
}
}
