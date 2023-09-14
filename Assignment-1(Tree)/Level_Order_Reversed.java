//Reverse Level Order Traversal


/*
import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		bt1.revLevOrd();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void revLevOrd(){
            Queue<Node> nq =  new LinkedList<>();
            List<List<Integer>> ans =  new ArrayList<>();
            if(root==null) return ;
            nq.offer(root);
            while(!nq.isEmpty()){
                int n =  nq.size();
                List<Integer> lst =  new ArrayList<>();
                for(int i = 0 ; i<n ; i++){
                    if(nq.peek().left!=null) nq.offer(nq.peek().left);
                    if(nq.peek().right!=null) nq.offer(nq.peek().right);
                    lst.add(nq.poll().data);
                }
                ans.add(lst);
            }
            for(int i = ans.size() -1 ; i>=0 ; i--){
                for(int j  = 0 ; j<ans.get(i).size() ; j++){
                    System.out.print(ans.get(i).get(j) + " ");
                }
            }
        }
	}
}
 */