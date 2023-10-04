//Vertical Order Print Binary Tree


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
public class Vertical_Traversal_BT{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in) ; 
		String s =  sc.nextLine();
		s = s.trim();
		TreeNode root =  createBinaryTree(s) ;
		Map<Integer , List<Integer>> hm =  new TreeMap<>();
	   byPreorderTraversal(root, hm ,  0) ; 
	   for(Integer e  : hm.keySet()){
		   for(Integer i : hm.get(e)) System.out.print(i+" ");
	   }
       sc.close();
	}
   public static void byPreorderTraversal(TreeNode root ,Map<Integer , List<Integer>> hm , int d){
	   if(root==null) return ; 
	   if(!hm.containsKey(d)){
		   hm.put(d , new ArrayList<>());
	   }
	   hm.get(d).add(root.val);
	   byPreorderTraversal(root.left ,  hm  ,  d-1);
	   byPreorderTraversal(root.right ,  hm  ,  d+1);
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