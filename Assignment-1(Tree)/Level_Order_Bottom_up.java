//Bottom Up Level Order


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
	public static void main(String[] args){
	    Scanner sc =  new Scanner(System.in);
        String s =  sc.nextLine();
		TreeNode root = createBinaryTree(s);
        bottomLevelOrder(root);
	}

    public static void bottomLevelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> nq =  new LinkedList<>();
        if(root==null)  return ;
        nq.offer(root);
        while(!nq.isEmpty()){
            int n =  nq.size();
            List<Integer> lst = new ArrayList<>();
            for(int i = 0 ; i<n ; i++){
                if(nq.peek().left!=null) nq.offer(nq.peek().left);
                if(nq.peek().right!=null) nq.offer(nq.peek().right);
                lst.add(nq.poll().val);
            }
            ans.add(lst);
        }
        for(int i = ans.size()-1 ; i>=0 ; i--){
            for(int j = 0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }


    public static TreeNode createBinaryTree(String input) {
        String[] values = input.split(" ");
        int index = 0;

        if (values.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[index++]));
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (index < values.length) {
                String leftVal = values[index++];
                if (!leftVal.equals("N")) {
                    current.left = new TreeNode(Integer.parseInt(leftVal));
                    queue.offer(current.left);
                }
            }

            if (index < values.length) {
                String rightVal = values[index++];
                if (!rightVal.equals("N")) {
                    current.right = new TreeNode(Integer.parseInt(rightVal));
                    queue.offer(current.right);
                }
            }
        }
        return root;
    }

}
 */