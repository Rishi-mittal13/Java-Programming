/*Sample Input
1
6
5 15 1 3 2 8
Sample Output
5 10 5 4 3 4 */

import java.util.* ; 
public class Medium_Running_Integer {
    public static void SolveMedium(int[] arr , int n){
        // Queue<Integer>  maxq = new PriorityQueue<>(new Comparator<Integer>() {
        //     public int compare(int a , int b) {
        //         return b - a ;
        //     }
        // });
        if(n==0) return  ; 
        Queue<Integer>  maxq = new PriorityQueue<>((a,b)->b-a);
        Queue<Integer>  minq = new PriorityQueue<>();
        maxq.offer(arr[0]) ; 
        int medium =  maxq.peek(); 
        System.out.println(medium + " ");
        for(int i =  1 ; i<n ; i++){
            int elm =  arr[i] ; 
            if(maxq.size()>minq.size()){
                if(elm<medium){
                    minq.offer(maxq.poll());
                    maxq.offer(elm);
                }
                else maxq.offer(elm);
                medium = (minq.peek() + maxq.peek())/2 ; 
            }
            else if(maxq.size()<minq.size()){
                if(elm>medium){
                    maxq.offer(minq.poll());
                    minq.offer(elm);
                }
                else maxq.offer(elm);
                medium = (maxq.peek() + minq.peek())/2 ; 
            }
            else {
                if(elm>medium){
                    minq.offer(elm) ; 
                    medium = minq.peek(); 
                }
                else{
                    maxq.offer(elm) ; 
                    medium =  maxq.peek() ;
                }
            }
            System.out.print(medium +  " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t  = sc.nextInt() ; 
        for(int i = 0 ; i<t ; i++){
            int n  =  sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j<n ; j++) arr[j] =  sc.nextInt() ; 
            SolveMedium(arr , n);
            System.out.println();
        }
        sc.close();
    }
}
