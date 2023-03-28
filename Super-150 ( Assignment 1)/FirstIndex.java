/*Take as input N, the size of array. Take N more inputs and store that in an array.
 Take as input M, a number. Write a recursive function which returns the first index at which M
is found in the array and -1 if M is not found anywhere. Print the value returned. */

import java.util.*;
public class FirstIndex {
    public static int search(int[] arr , int k,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == k){
            return i;
        }
        return search(arr,k,i+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }        
        int k = sc.nextInt();
        System.out.println(search(arr,k,0));
        sc.close();
    }
}
