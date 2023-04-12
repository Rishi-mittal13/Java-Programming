/*Sample Input
4
0 0 1 0
0 0 1 0
0 0 0 0
0 0 1 0
Sample Output
2 */

import java.util.*;
public class _6Celebrity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0 ;i<n ; i++) for(int  j = 0 ;j<n ; j++) arr[i][j] = sc.nextInt();
            int c = 0;
            for(int i = 0 ;i<n ; i++) {
                if(arr[0][i] == 1) {
                    c=i;break;
                }
            }
            for(int i = 0 ;i<n ; i++){
                if(i!=c && arr[i][c]!=1){
                    System.out.println("No Celebrity");return;
                }
                else if(i==c && arr[i][c]!=0){
                    System.out.println("No Celebrity"); return ;
                }
            }
            System.out.println(c);
            sc.close();
        }
    }
}
