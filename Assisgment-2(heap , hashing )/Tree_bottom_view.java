//Tree bottom view

import java.util.* ; 

class TreeNode{
	int val ;
	TreeNode left ; 
	TreeNode right ; 
	public TreeNode(){}
	public TreeNode(int val){
		this.val  =  val ; 
	}
}
class Pair{
	int hd ; 
	TreeNode n ;
	Pair(int hd  , TreeNode n){
		this.n = n ; 
		this.hd =  hd  ;
	}
}
public class Tree_bottom_view{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in) ; 
		String s =  sc.nextLine();
		TreeNode root =  createBinaryTree(s) ;
		verticalTraversalTop(root);
        sc.close() ; 
	}
	public static void verticalTraversalTop(TreeNode root) {
	   Queue<Pair> nq =  new LinkedList<>();
	   Map<Integer , Integer> hm =  new TreeMap<>();
	   nq.offer(new Pair(0  , root));
	   while(!nq.isEmpty()){
		   Pair pr = nq.poll();
			hm.put(pr.hd , pr.n.val);
		   if(pr.n.left!=null) nq.offer(new Pair(pr.hd-1 ,  pr.n.left));
		   if(pr.n.right!=null) nq.offer(new Pair(pr.hd+1 ,  pr.n.right));
	   }
	   for(Integer e  : hm.keySet()){
		   System.out.print(hm.get(e)+" ");
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

