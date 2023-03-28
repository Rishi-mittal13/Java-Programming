/*Take as input str, a number in form of a string. Write a recursive function to convert the number in
 string form to number in integer form.
 E.g. for “1234” return 1234. Print the value returned. */


import java.util.Scanner;
public class convertInttoString {
    public static int toInt(String ans,int c){
        if(c==ans.length()){
            return 0;
        }
        int a = (int)ans.charAt(c)-48;
       return (a*toInt(ans,c+1)+a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toInt(s,0));
        sc.close();
    }
}
