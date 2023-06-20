import java.util.Scanner;

public class C_Sum_in_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long sum = 0;
            while (n > 0) { sum += n; n /= 2; }
            System.out.println(sum);
            t--;
        }
        sc.close();
    }
}
