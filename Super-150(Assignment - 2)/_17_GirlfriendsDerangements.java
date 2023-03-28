// 2 //1

//Time-complexity => O(n^2) basic recursion Approach .

import java.util.Scanner ;
public class _17_GirlfriendsDerangements{
    public static int GirlCount(int n ){
        if(n==1) return 0;
        if(n==2) return 1;
        return (n-1)*(GirlCount(n-1)+GirlCount(n-2));
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GirlCount(n));
        sc.close();
    }
}