
import java.util.Scanner;
import java.lang.Math;
public class arm_palin_stro {
    public static int factorial(int n1){
        int fact = 1;
        for(int i = 1 ; i<=n1 ; i++){
            fact*=i;
        }
        return fact;
    }
    public static String palindrome(int n){
        int result = 0;
        int temp=n;
        while(temp!=0){
            int a = temp%10;
            result = result*10 + a;
            temp=temp/10;
        }
        if(n==result){
            return "Yes, it is palindrome number";
        }
        else{
            return "No, it is not a palindrome number ";
        }

    }
    public static String armstrong(int n){
        int temp = n;
        int digit = 0;
        int result = 0;
        while(temp!=0){
            temp/=10;
            digit+=1;
        }
        temp = n;
        while(temp!=0){
            int a = temp%10;
            result+=Math.pow(a,digit);
            temp/=10;
        }
        if(n==result){
            return "Yes, it is armstrong number";
        }
        else{
            return "No, it is not a armstrong number ";
        }
    }
    public static String strong(int n){
        int result = 0 ;
        int temp = n;
        while(temp!=0){
            int a = temp%10;
            result+=factorial(a); 
            temp/=10;
        }
        if(n==result){
            return "Yes, it is strong number";
        }
        else{
            return "No, it is not a strong number ";
        }

    }
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrom , armstrong , strong nmumber : ");
        int num = sc.nextInt();
        String armstrongResult = armstrong(num);
        String palindromeResult = palindrome(num);
        String strongResult = strong(num);
        System.out.println(armstrongResult);
        System.out.println(strongResult);
        System.out.println(palindromeResult);


        sc.close();
    }
    
}
