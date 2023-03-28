//Replace all 0's with 5


import java.util.Scanner ;
public class replaceAll0T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0 ;
        while(temp>0){
            count++;
            if((temp%10==0)){
                sum += (int) Math.pow(10,count)/2;
            }
            temp/=10;
        }
        System.out.println(sum+n);
        sc.close();
    }
    
}
