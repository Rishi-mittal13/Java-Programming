//Root to Leaf ( Binary Tree)



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
        int target =  sc.nextInt();
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> lst =  new ArrayList<>();
        RTL1(root , target , lst , ans);
        for(int i = 0 ; i<ans.size() ; i++){
            for(int j = 0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
	}
    public static void RTL1(TreeNode root , int target ,List<Integer> lst , List<List<Integer>> ans){
        if(root==null)  return ;
        lst.add(root.val);
        if(target-root.val==0  && root.left==null && root.right==null){
            ans.add(new ArrayList<>(lst));
        }
        RTL1(root.left , target-root.val , lst , ans);
        RTL1(root.right , target-root.val , lst , ans);
        lst.remove(lst.size()-1);
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
}
 */