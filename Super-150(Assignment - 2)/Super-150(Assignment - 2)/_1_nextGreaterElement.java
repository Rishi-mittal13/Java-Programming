/*Sample Input
2
4
11 13 21 3
5
11 9 13 21 3 // 13 13 21 -1 11
Sample Output
11,13
13,21
21,-1
3,-1
11,13
9,13
13,21
21,-1
3,-1 */
import java.util.*;

public class _1_nextGreaterElement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();
			nextLarger(arr);
			t--;
		}
        scn.close();
	}
	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
		/*Approach - 1 : - 
		Stack<Integer> st = new Stack<Integer>();
        st.add(0,1);
		int[] ans = new int[arr.length];
		for(int i = 0;  i<arr.length ; i++){
			while(!st.isEmpty() && arr[i]>arr[st.peek()]){
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) ans[st.pop()] = -1;
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+","+ans[i]);
        }*/
		//Approach -2 :- 
		Stack<Integer> st = new Stack<>();
		int n = arr.length ;
		int[] ans = new int[n];
 		for(int i = n-1 ; i>=0 ; i--){
			while(!st.isEmpty() && (arr[i]>arr[st.peek()])){
				st.pop();
			}
			if(st.isEmpty()) ans[i] = -1;
			else ans[i] = arr[st.peek()];
			st.push(i);
		}
		for(int j = 0 ;j<n ; j++){
			System.out.println(arr[j]+","+ans[j]);
		}
	}
}
