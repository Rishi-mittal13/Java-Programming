/*Sample Input
2
10000 1
1000000000000000 10
Sample Output
10000
31 */

import java.util.*;
public class _1_KthRoot{
    public static long kroot(long n , int k){
        double r = Math.log10(n);
        double p = r/k;
        long ans =  (long)Math.pow(10,p);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        for(int i  = 0 ; i <t ; i++){
            long n =  sc.nextLong();
            int k = sc.nextInt();
            System.out.println(kroot(n,k)); 
        }  
        sc.close();
    }
}