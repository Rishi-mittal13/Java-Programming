import java.util.Scanner;
public class splitArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n ; i++){
            arr[i] = S.nextInt();
        }
        int o = split_arr(arr,0,0,0,"","");
        System.out.println(o);
        S.close();
    }
    public static int split_arr(int[] arr , int i , int a , int b , String s, String p){
        if(i==arr.length && a==b){
            System.out.print(s+"and ");
            System.out.print(p);
            return 1;
        }
        if(i>=arr.length)
            return 0;
            int g = split_arr(arr,i+1,a+arr[i],b,s+arr[i]+" ",p);
            int h = split_arr(arr,i+1,a,b+arr[i],s,p+arr[i]+" ");
        return g+h;
    }
}
