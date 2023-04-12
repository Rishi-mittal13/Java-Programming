//tower of hanoi peg a to b using c

import java.util.*;
public class _24TOH {
    static int count = 0 ;
    public static void Toh(int disk , String src , String hlp , String dst){
        if(disk==0) return ;
        count++;
        Toh(disk-1,src,dst,hlp);
        System.out.println("Move " + disk +"th Disk From " + src + " to " + dst);
        Toh(disk-1,hlp,src,dst);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disk = sc.nextInt();
        Toh(disk , "A" , "C" ,  "B");
        System.out.println(count);
    }
}
