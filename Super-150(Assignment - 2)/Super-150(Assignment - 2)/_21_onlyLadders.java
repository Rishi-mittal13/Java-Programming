import java.util.*;

public class _21_onlyLadders {
    static ArrayList<ArrayList<Integer>> allPaths = new ArrayList<ArrayList<Integer>>();
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    public static int countWays(int curr, int dest, int N) {
        if (curr == dest)
            return 1;
        if (curr > dest)
            return 0;
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            int next = curr + i;
            if (next > N)
                break;
            count += countWays(next, dest, N);
        }
        return count;
    }

    static void findPaths(int curr, int dest, int N, ArrayList<Integer> path) {
        if (curr == dest) {
            allPaths.add(new ArrayList<Integer>(path));
            return;
        }
        if (curr > dest)
            return;
        for (int i = 1; i <= 6; i++) {
            int next = curr + i;
            if (next > N)
                break;
            path.add(next);
            findPaths(next, dest, N, path);
            path.remove(path.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // finding all the prime numbers in the given range
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        
        // finding the number of distinct ways to cross the board
        int count = countWays(0, N, N);
        
        // finding all the valid paths to cross the board
        ArrayList<Integer> path = new ArrayList<Integer>();
        path.add(0);
        findPaths(0, N, N, path);
        
        // printing all the valid paths
        for (ArrayList<Integer> p : allPaths) {
            for (int i = 0; i < p.size() - 1; i++) {
                System.out.print(p.get(i) + " ");
            }
            System.out.print("END , ");
        }
        System.out.println("\n"+count);
    }
}

