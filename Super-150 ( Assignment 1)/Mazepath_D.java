import java.util.Scanner;
public class Mazepath_D {
    static int count = 0 ;
    public static void mazeD(int row , int col ,int dig , String ans){
        if((row==1 && col==1) || (row==1 && col==1 && dig==1)){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(row>1){
            mazeD(row-1, col, dig, ans+"V");
        }
        if(col>1){
            mazeD(row, col-1, dig, ans+"H");
        }
        if((row>1) && (col>1) && (dig>1)){
            mazeD(row-1, col-1, dig-1, ans+"D");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int dig = Math.min(row,col);
        mazeD(row,col,dig,"");
        System.out.println("\n"+count);
        sc.close();
    }
}
