import java.util.Scanner;
public class boardPath {
    static int count = 0;
    public static void path(int sum , int n , int m ,String ans){
        if((sum==n)){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(sum>n){
            return;
        }
        for(int i = 1 ; i<=m ; i++){
            path(sum+i,n,m,ans+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        path(0,n,m,"");
        System.out.println("\n"+count);
        sc.close();
    }
}
