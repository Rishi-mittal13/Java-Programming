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
        }
	}
}
