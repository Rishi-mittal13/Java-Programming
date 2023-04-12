/*Sample Input
4
D I DD II
Sample Output
21
12
321 
123 */

import java.util.*;
public class _17fORMmINIMUMNO {
    public static String DI(String s){
        int n = s.length();
        int[] ans = new int[n+1];
        int count = 1;
        for(int i = 0 ;i<=n ; i++){
            if(i==n || s.charAt(i)=='I'){
                ans[i] = count;
                count++;
                for(int j  =  i-1 ; j>=0 && s.charAt(j)!='I' ; j--){
                    ans[j] = count;
                    count++;
                }
            }
        }
        String a = "";
        for(int i : ans) a+=i;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            String s =  sc.next();
            System.out.println(DI(s));
        }
        sc.close();
    }
}
