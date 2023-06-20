import java.util.*;
public class A_Sasha_and_Array_Coloring{
    public static int calculateMax(int[] arr){
        Arrays.sort(arr);
        int ans = 0 , n = arr.length;
        for(int i = 0 ; i<(n/2) ; i++){
            ans+=(arr[n-1-i] - arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            int n =  sc.nextInt();
            int[] arr =  new int[n];
            for(int j = 0 ; j<n ; j++) arr[j] =  sc.nextInt();
            int ans =  calculateMax(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}
