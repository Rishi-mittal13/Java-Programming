//sort game 

import java.util.*;
class info{
	String name ; 
	int val ; 
	public info(){}
	public info(String name , int val){
		this.name =  name ; 
		this.val =  val  ; 
	}
}
public class sort_Game {
    public static void main(String args[]) {
        Scanner  sc =  new Scanner(System.in);
		int x = sc.nextInt();
		int n =  sc.nextInt();
		List<info> arr =  new ArrayList<>();
		for(int i = 0 ; i<n ; i++){
			String name =  sc.next();
			int sal  = sc.nextInt();
			if(sal>=x){
				info data =  new info(name ,  sal);
				arr.add(data);
			}
		}
		Collections.sort(arr , new Comparator<info>(){
			public int compare(info a , info b ){
				return a.name.compareTo(b.name) ; 
			}
		});
		Collections.sort(arr , new Comparator<info>(){
			public int compare(info a , info b ){
				return b.val - a.val ; 
			}
		});
		for(int i = 0; i<arr.size() ; i++){
			System.out.println(arr.get(i).name + " " + arr.get(i).val);
		}
		sc.close();
    }
}
