import java.util.*;
public class B_Long_Long{
    public static long[] calc(int[] arr){
        int  b = 0 ;
        long  get = 0  , sum = 0 ;
        long[] ans = new long[2];
        for(int i : arr){
            if(b==0 && i<0){
                b=1;
                sum+=(-i);
                get++;
            }
            else if(b==1 && i<=0) sum+=(-i);
            else{
                b = 0;
                sum+=i;
            }
        }
        ans[0] =  sum ;
        ans[1] =  get;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n =  sc.nextInt();
            int[] arr =  new int[n];
            for(int j = 0  ; j<n  ;j++) arr[j] =  sc.nextInt();
            long[] ans =  calc(arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
        sc.close();
    }
}