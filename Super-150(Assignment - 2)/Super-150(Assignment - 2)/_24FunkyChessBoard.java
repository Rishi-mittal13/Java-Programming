import java.util.Scanner;

public class Main {
    static int n,board[][], sum = 0, hi;

    static void set(int i, int j, int count) {
        if (i < 0 || i >= 10 || j < 0 || j >= 10 || board[i][j] == 0)
            return;
        int ans = 0;
        board[i][j] = 0; // unsets the (i,j) cell
        hi = Math.max(hi, count + 1); // hi stores the maximum of value of visited squares
        // try all 8 possible moves for knight
        set(i - 1, j - 2, count + 1);
        set(i - 2, j - 1, count + 1);
        set(i + 1, j - 2, count + 1);
        set(i + 2, j - 1, count + 1);
        set(i - 1, j + 2, count + 1);
        set(i - 2, j + 1, count + 1);
        set(i + 1, j + 2, count + 1);
        set(i + 2, j + 1, count + 1);
        board[i][j] = 1; // sets (i,j) cell again(backtracking)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[10][10];
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1)
                    sum++; // sum stroes total number of valid cells on chessboard
            }
        }
        hi = 0;
        set(0, 0, 0);
        System.out.println(sum - hi);
        sc.close();
    }
}
