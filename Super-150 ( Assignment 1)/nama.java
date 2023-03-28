import java.util.Scanner;

public class nama {
    static int d=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        print(arr,t,"",0);
        System.out.print('\n'+""+d);
    }
    
    public static void print(int [] arr,int t,String ans,int c){
        if(t==0){
            System.out.print(ans+" ");
            d++;
            return;

        }
        if(t<0 ){
            return;
        }
            print(arr,t-arr[c],ans+arr[c]+" ",c+1);
    }
    
}