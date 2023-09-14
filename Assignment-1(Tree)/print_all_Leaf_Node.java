//Binary Trees -- Print All Leaf Nodes



/*
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        List<Integer> lst =  new ArrayList<>();
        int root = sc.nextInt();
        lst.add(root);
        int count = 0 ;
            while(sc.hasNext()){
                int l = sc.nextInt();
                int r =  sc.nextInt();
                if(l==-1 && r==-1) count++;
                else{
                if(l!=-1) lst.add(l);  
                if(r!=-1) lst.add(r);  
            }
        }
        for(int i = lst.size()-count ; i<lst.size() ; i++){
            System.out.print(lst.get(i) + " ");
        }


    }
}
 */