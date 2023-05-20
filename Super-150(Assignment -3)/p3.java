/*Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13  */

import java.util.*;
public class p3 {
    public static void RotateShift(int[][] matrix) {
      int n = matrix.length;
      int temppory[][] = new int[n][n];
      int index = n - 1;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          temppory[i][j] = matrix[j][index];
        }
        index--;
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(temppory[i][j] + " ");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n =  scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                arr[i][j] =  scan.nextInt();
            }
        }
        RotateShift(arr);
        scan.close();
    }
}