import java.util.Scanner;
public class lexicoCounting {
    public static void printLexico(int a , int n){
        if(a>n){
            return ;
        }
        System.out.print(a+" ");
        int i = 0 ;
        if(a==0){
            i = 1;
        }
        for(; i<=9 ; i++){
            printLexico(a*10+i,n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLexico(0,n);
    }
}
