import java.util.* ;
public class Ksum {
    public static int printsub(int[] ar , int k , String s ,  int i ){
        if(k==0){
            System.out.print(s+" ");
            return 1;
        }
        int a = 0;
        for(int j = i ; j<ar.length ; j++){
            if(ar[j]<=k){
                a+=printsub(ar,k-ar[j],s+ar[j]+" ",j+1);
            }
        }
        return a; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i< n ; i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int b = printsub(ar,k,"",0);
        System.out.println();
        System.out.println(b);
        sc.close();
    }
}
