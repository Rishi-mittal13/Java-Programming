// Take as input N, a number. Print odd numbers in decreasing
//  sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion.

import java.util.*;
public class oddEvenRecursion{
    public static void printodd(int n){
        if(n<=0) return ;
        if(n%2==1) System.out.println(n);
        printodd(n-1);}
    public static void printeven(int n,int temp){ 
        if(temp>n) return;
        if(temp%2==0) System.out.println(temp);
        printeven(n, temp+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printodd(n);
        printeven(n,2);
        sc.close();
    }
}