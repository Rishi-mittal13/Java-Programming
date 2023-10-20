/*Sample Input
1
5 2
5 1 3 5 2
Sample Output
5 1 5 1 3 5 1 5 1 */

import java.util.*;
public class k_frequent_in_Stream {
  public static void solveKfrequent(int[] arr, int n, int k) {
    int[] top = new int[k + 1];
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < k + 1; i++) hm.put(i, 0);
    for (int m = 0; m < n; m++) {
      hm.put(arr[m] , hm.getOrDefault(arr[m], 0)+1); 
      top[k] = arr[m];
      int i = -1;
      for(int ind= 0 ; ind<top.length ; ind++) {
        if(top[ind]==arr[m]){
            i = ind ;
            break ; 
        }
      }
      i -= 1;

      while (i >= 0) {
        if (hm.get(top[i]) < hm.get(top[i + 1])) {
          int temp = top[i];
          top[i] = top[i + 1];
          top[i + 1] = temp;
        }
       
        else if ((hm.get(top[i]) == hm.get(top[i + 1])) && (top[i] > top[i + 1])) {
          int temp = top[i];
          top[i] = top[i + 1];
          top[i + 1] = temp;
        } 
        else break;
        i -= 1;
      }
      for (int j = 0; j < k && top[j] != 0; ++j) System.out.print(top[j] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for (int j = 0; j < tc; j++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
      solveKfrequent(arr, n, k);
      System.out.println();
    }
    sc.close();
  }
}
