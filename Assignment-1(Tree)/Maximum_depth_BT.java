//Maximum Depth of Binary Tree



/*
import java.util.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
        int ans = bt1.maxdepth(bt1.root);
        System.out.print(ans);
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
    public  int maxdepth(Node n){
        if(n==null) return 0;
        int lh =  maxdepth(n.left);
        int rh =  maxdepth(n.right);
        return Math.max(lh , rh) + 1;
    }
	}
}



 */