import java.util.Scanner;
public class genBinaryString {
    public static void binary(String b , String ans,int i){
        if(b.length()==ans.length()){
            System.out.print(ans+" ");
            return;
        }
        if(b.charAt(i)=='?'){
            binary(b,ans+'1',i+1);
            binary(b,ans+'0',i+1);
        }
        else{
            binary(b,ans+b.charAt(i),i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i<n ; i++){
        String b = sc.next();
        binary(b,"",0);
    }
        sc.close();
    }
}
