// Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input M, a number. Write a recursive function which returns an array containing indices of
// all items in the array which have value equal to M. 
// Print all the values in the returned array.

import java.util.Scanner;
public class AllIndices {
    public static void printAll(int ar[] , int k , int temp){
        if(temp == ar.length){
            return ;
        }
        if(ar[temp]==k){
            System.out.print(temp + " ");
        }
        printAll(ar,k,temp+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n ; i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        printAll(ar,k,0);
        sc.close();
    }
}
