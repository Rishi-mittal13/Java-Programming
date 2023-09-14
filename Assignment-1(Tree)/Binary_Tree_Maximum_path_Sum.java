//Binary Tree Maximum Path Sum
//https://hack.codingblocks.com/app/contests/4948/1677/problem


/*
 import java.util.*;
class TreeNode {
    int val ;
    TreeNode left ; 
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){ this.val =  val ; }
}
public class Main {
    static int ans ;
    public static void main (String args[]) {
        ans =  Integer.MIN_VALUE;
        Scanner sc  =  new Scanner(System.in);
        String input = sc.nextLine();
        TreeNode root = createBinaryTree(input);
        Solve(root);
        System.out.print(ans);
    }

    public static int Solve(TreeNode root){
        if(root==null)  return 0 ;
        int l =  Solve(root.left);
        int r =  Solve(root.right);
        int max1 =  Math.max(Math.max(l,r)+root.val , root.val);
        int max2 =  Math.max(l+r+root.val , max1);
        ans =  Math.max(max2 ,ans);
        return max1;
    }

    public static TreeNode createBinaryTree(String input) {
        String[] values = input.split(" ");
        int index = 0;

        if (values.length == 0) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[index++]));
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (index < values.length) {
                String leftVal = values[index++];
                if (!leftVal.equals("-1")) {
                    current.left = new TreeNode(Integer.parseInt(leftVal));
                    queue.offer(current.left);
                }
            }

            if (index < values.length) {
                String rightVal = values[index++];
                if (!rightVal.equals("-1")) {
                    current.right = new TreeNode(Integer.parseInt(rightVal));
                    queue.offer(current.right);
                }
            }
        }
        return root;
    }

}
 */