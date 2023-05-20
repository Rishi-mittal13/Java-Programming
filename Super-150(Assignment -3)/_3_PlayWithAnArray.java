/*Sample Input
1
5
5 4 3 2 1
Sample Output
1 */
import java.util.*;
public class _3_PlayWithAnArray {
    public static int game(int[] arr , int n){
        int[] p =  new int[101];
        for(int i  = 0 ; i<n ; i++){
            p[arr[i]]++;
            if(p[arr[i]]>2) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int  i  = 0  ; i<t  ; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0  ;j<n ; j++) arr[j] =  sc.nextInt();
            System.out.println(game(arr,n));
        }
        sc.close();
    }
}
