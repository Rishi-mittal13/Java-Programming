//finding factorialn of a number

import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.printf("Enter a number: ");
    long  a =in.nextInt();
    long  fact = 1;
    for (long  i =1 ; i<=a;i++){
        fact*=i;
    }
    System.out.println("Result: " + fact);

in.close();
}}
