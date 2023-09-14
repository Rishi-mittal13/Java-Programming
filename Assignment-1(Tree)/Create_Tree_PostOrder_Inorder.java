//Create Tree (Using Postorder and Inorder)



/*
import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		Node(int data) {this.data =  data; }
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int ps, int pe, int[] in, int is, int ie) {
			if(ps>pe || is>ie)  return null;
			Node nn =  new Node(post[pe]);
			int ind = 0 ;
			for(int i = 0 ; i<in.length ; i++){
				if(in[i]==nn.data) ind =  i ;
			}
			nn.left = construct(post ,  ps , (ps + (ind-is)-1) , in , is , ind-1); 
			nn.right = construct(post , (ps + (ind-is)) , pe-1 , in , ind+1 , ie );
			return nn ; 
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}

 */