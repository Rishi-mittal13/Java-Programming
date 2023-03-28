//Maze_path( Count, Print)

import java.util.Scanner;
public class MazePath {
    static int count = 0;
    public static void printPath(int row , int col , String ans){
        if((row == 1) && (col == 1)){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(row>1){
        printPath(row-1, col, ans+"V");}
        if(col>1){
        printPath(row, col-1, ans+"H");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        printPath(row,col,"");
        System.out.println("\n"+count);
        sc.close();
    }
}