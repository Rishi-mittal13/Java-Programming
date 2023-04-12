/*Sample Input
2
Sample Output
1 */


import java.util.*;
public class _10GirlFreindderangement {
    public static int GF(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return (n-1)*(GF(n-1)+GF(n-2));
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GF(n));
        sc.close();
    }
}
