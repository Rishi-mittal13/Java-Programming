/*Sample Input
3
Sample Output
{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-2}P{2-2} 
{0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2}
 {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}P{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2}
  {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}P{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{2-2}
14 */
/*{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-2}P{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}P{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}P{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{2-2} */
import java.util.*;
public class _23_ChessBoard_2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> p=new LinkedList<Integer>();
        primeSieve(n*n,p);
        // System.out.println(p);
        int c=chess(n,0,0,"{0-0}",p);
        System.out.println("\n"+c);
    }
    static int chess(int n,int i,int j,String ans,List<Integer> p){
        if(i==n-1 && j==n-1){
            System.out.print(ans+" ");
            return 1;
        }
        // System.out.println(p.indexOf(n*i+j+1));
        if(i>=n||j>=n||p.indexOf(n*i+j+1)%2==0)return 0;
        int c=0;
        if(p.indexOf(n*i+j+1)%2==1)c+=chess(n,n-1,n-1,ans+"P{"+(n-1)+"-"+(n-1)+"}",p);
        c+=chess(n,i+2,j+1,ans+"K{"+(i+2)+"-"+(j+1)+"}",p);
        c+=chess(n,i+1,j+2,ans+"K{"+(i+1)+"-"+(j+2)+"}",p);
        if(i==0||i==n-1||j==0||j==n-1){
            for(int k=j+1;k<n;k++){
                c+=chess(n,i,k,ans+"R{"+i+"-"+k+"}",p);
            }
            for(int k=i+1;k<n;k++){
                c+=chess(n,k,j,ans+"R{"+k+"-"+j+"}",p);
            }
        }
        if(i==j||i+j==n-1){
            for(int k=1;k<n-i;k++){
                c+=chess(n,i+k,j+k,ans+"B{"+(i+k)+"-"+(j+k)+"}",p);
            }
        }
        return c;
    }
    public static void primeSieve(int n, List<Integer> p){
        boolean a[]=new boolean[n+1];
        a[0]=a[1]=true;
        for (int i = 2; i*i <=n ; i++) {
            if(!a[i]){
                for (int j = 2; i*j <=n ; j++) {
                    a[i*j]=true;
                }
            }
        }
        for (int i = 0; i < n+1; i++) {
            if(!a[i])
                p.add(i);
        }
    }
}