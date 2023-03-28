import java.util.Scanner;
public class A_Polycarp_s_Pockets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++) arr[i] = sc.nextInt();
        int arr1[] = new int[101];
        for(int i : arr) arr1[i]++;
        int max = 0 ; 
        for(int i : arr1) if(i>max) max = i;
        System.out.println(max);
    }
}