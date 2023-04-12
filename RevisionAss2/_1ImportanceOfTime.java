/*5
5 4 2 3 1
5 2 1 4 3 // 7 */


import java.util.*;
public class _1ImportanceOfTime{
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i<n ; i++){
            int val = sc.nextInt();
            dq.addLast(val);
        }
        int[] arr = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0 , count = 0;
        while(!dq.isEmpty()){
            if(dq.peekFirst() == arr[i]){
                count++;i++;
                dq.pollFirst();
            }
            else{
                int val =  dq.pollFirst();
                dq.addLast(val);
                count++;
            }
        }
        System.out.println(count++);
        sc.close();
        
    }
}