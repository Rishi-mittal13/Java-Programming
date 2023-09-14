//Create tree ( Using preorder and inorder)



/*
import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
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
		Node(int val){ this.data = val ; }
		}

		private Node root;
		private int size;
		private  int preind = 0 ;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, in, 0, pre.length - 1);
		}

		private Node construct(int[] pre,int[] in, int isi, int iei) {
			if(isi>iei) return null;
			Node nn = new Node(pre[preind]);
			int ind  = -1;
			for(int i = isi ; i<=iei ; i++){
				if(in[i]==pre[preind]) {
					ind = i;
					break;
				}
			}
			preind++;
			nn.left = construct(pre ,  in , isi , ind-1);
			nn.right = construct(pre ,  in , ind + 1, iei);
			return nn;
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