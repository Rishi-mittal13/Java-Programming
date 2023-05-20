/*Sample Input
3
1 2 3
Sample Output
3 */
import java.util.*;
public class p2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num],brr = new long[num];
        for (int i = 0; i < num; ++i) {arr[i] = sc.nextInt();brr[i] = arr[i];}
        Arrays.sort(brr);
        long cnt = 0, sum = 0;
        for (int i = 0; i < num; ++i) {sum +=arr[i] - brr[i]; if(sum == 0) cnt++;}
        System.out.println(cnt);}
}
