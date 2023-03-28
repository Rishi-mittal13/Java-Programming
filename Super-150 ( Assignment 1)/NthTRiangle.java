// Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1,
// 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. 
// Print the value returned.


import java.util.Scanner;
public class NthTRiangle {
    public static int ntri(int n){
        if(n==1){
            return 1;
        }
        return n+ntri(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ntri(n));
        sc.close();
    }
}
