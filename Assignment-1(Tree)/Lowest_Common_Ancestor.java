//Lowest Common Ancestor (Binary Tree )



/*
 import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
	TreeNode(){}
    TreeNode(int x) { this.val = x; }
}

public class Main{
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args){
		TreeNode root = createTree();
		int p = sc.nextInt();
		int q = sc.nextInt();
		TreeNode ans =  LCA(root , p , q);
		System.out.print(ans.val);
	}
    public static TreeNode createTree(){
        int item=  sc.nextInt();
        TreeNode n =  new TreeNode();
        n.val =  item;
        boolean hasLeft =  sc.nextBoolean();
        if(hasLeft) n.left =  createTree();
        boolean hasRight =  sc.nextBoolean();
        if(hasRight) n.right =  createTree();
        return n;
    }
	public static TreeNode LCA(TreeNode root , int p , int q){
		if(root==null) return null;
		if(root.val==p || root.val==q) return root;
		TreeNode left = LCA(root.left ,  p  , q);
        TreeNode right = LCA(root.right ,  p  , q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
	}
}
 */