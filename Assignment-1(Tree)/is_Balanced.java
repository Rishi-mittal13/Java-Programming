//Is Balanced (Binary Tree)



/*
import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root);
		}

		private boolean isBalanced(Node node) {
			return height(node)!=-1;
			
		}
		public  int height(Node root){
			if(root==null) return 0;
			int lh =  height(root.left);
			if(lh==-1) return -1;
			int rh =  height(root.right);
			if(rh==-1) return -1;
			if(Math.abs(lh-rh)>1) return -1;
			return Math.max(lh ,  rh) + 1;

		}
	}
}

 */