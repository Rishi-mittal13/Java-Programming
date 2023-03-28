//replace All pi to 3.14.


import java.util.*;
public class replaceAllPie {
    public static String replace(String s){
        StringBuffer sa = new StringBuffer();
        int n = s.length();
        for(int i = 0 ; i<n-1 ; i++ ){
            String st = s.substring(i,i+2);
            if(st.equals("pi")){
                sa.append("3.14");
                i++;
            }
            else{
                sa.append(s.charAt(i));
            }
        }
        if(!((s.substring(n-2)).equals("pi"))) sa.append(s.charAt(n-1));
        return sa.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ;i++){
            String str = sc.next();
            System.out.println(replace(str));
        }
        sc.close();
    }
}