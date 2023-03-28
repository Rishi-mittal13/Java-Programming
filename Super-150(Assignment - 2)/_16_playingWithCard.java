/*5 1
3 4 7 6 5  
// output
4
6
3
7
5 */
import java.util.*;
public class _16_playingWithCard {
    static int maxsize = 100001;
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void nthprime(){
        boolean[] isprime = new boolean[maxsize];
        for(int j = 2 ; (j*j)<maxsize ; j++){
            if(isprime[j]==false){
            for(int i = j ; i*j<maxsize ; i++){
                isprime[i*j] = true;
            }
        }
        }
        for(int i = 2 ; i<100001 ; i++){
            if(isprime[i]==false) arr.add(i);
        }
        //System.out.println(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nthprime();
        
        
    }
}
