//Binary Tree - Max Path Sum

// import java.util.*;
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
// 	TreeNode(){}
//     TreeNode(int x) { this.val = x; }
// }

// public class Main{
// 	static Scanner sc =  new Scanner(System.in);
//     static int ans ;
// 	public static void main(String[] args){
// 		TreeNode root = createTree();
//         ans = Integer.MIN_VALUE;
//         Solve(root);
//         System.out.print(ans);
// 	}
//     public  static TreeNode createTree(){
//         String item=  sc.next();
//         TreeNode n =  new TreeNode();
//         if(!item.equals("NULL")) n.val =  Integer.parseInt(item);
//         else return null;
//         n.left =  createTree();
//         n.right =  createTree();
//         return n;
//     }
//     public static int Solve(TreeNode root){
//         if(root==null) return 0 ;
//         int l = Solve(root.left);
//         int r = Solve(root.right);
//         int max1 = Math.max(Math.max(l,r)+root.val , root.val);
//         int max2 = Math.max(l+r+root.val , max1);
//         ans = Math.max(ans , max2 );
//         return max1;
//     }
// }