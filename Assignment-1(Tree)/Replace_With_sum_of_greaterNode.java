//Replace with Sum of greater nodes


/*
import java.util.*;
class TreeNode{
	int val ;
	TreeNode left ;
	TreeNode right ;
	TreeNode(){}
	TreeNode(int val){ this.val = val; }
}
public class Main{
	public static TreeNode createBST(int[] in , int s , int e){
		if(s>e) return null;
		int mid = (s+e)/2;
		TreeNode root = new TreeNode(in[mid]);
		root.left = createBST(in , s, mid-1);
		root.right =  createBST(in , mid+1 , e);
		return root;
	}
	public static void preorderTraverse(TreeNode root){
		if(root==null) return ;
		System.out.print(root.val + " ");
		preorderTraverse(root.left);
		preorderTraverse(root.right);
	}
	public static int replace(TreeNode root , int s){
		if(root==null)  return 0 ;
		int r =  replace(root.right , s);
		int rootData =  root.val;
		root.val =  r + root.val + s ;
		int l =  replace(root.left , root.val);
		return rootData + l + r;
	}
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int n =  sc.nextInt();
		int[] in = new int[n];
		for(int i = 0 ; i<n ; i++) in[i] =  sc.nextInt() ;
		TreeNode root =  createBST(in , 0 , in.length-1);
		replace(root , 0);
		preorderTraverse(root);
		sc.close();
	}
}

 */