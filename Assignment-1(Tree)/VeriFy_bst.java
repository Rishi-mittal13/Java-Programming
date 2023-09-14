//Determine whether a given binary tree is a BST or not



/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	static class BinaryTreeFromLvlOrder {

		private Scanner s = new Scanner(System.in);

		private class Node {
			int val;
			Node left;
			Node right;

			public Node(int val) {
				this.val = val;
			}
		}

		private Node root;

		public BinaryTreeFromLvlOrder() {
			// TODO Auto-generated constructor stub
			root = construct();// 2k
		}

		private Node construct() {
			// TODO Auto-generated method stub

			int val = s.nextInt();
			Node nn = new Node(val);
			Queue<Node> lvl = new LinkedList<>();
			lvl.add(nn);

			while (!lvl.isEmpty()) {
				Node front = lvl.remove();
				int a = s.nextInt();
				int b = s.nextInt();

				if (a != -1) {
					Node na = new Node(a);
					front.left = na;
					lvl.add(na);
				}

				if (b != -1) {
					Node nb = new Node(b);
					front.right = nb;
					lvl.add(nb);
				}
			}
			return nn;// 2k
		}

		private boolean isValid() {
			bstp b = validB(root);
            return b.isBST;
		}
        public bstp validB(Node root){
            if(root==null)  return new bstp();
            bstp l = validB(root.left);
            bstp r = validB(root.right);
            bstp s = new bstp();
            s.max = Math.max(l.max ,  Math.max(r.max ,  root.val));
            s.min = Math.min(l.min ,  Math.min(r.min ,  root.val));
            if(l.isBST && r.isBST  && l.max<root.val && r.min>root.val) s.isBST = true;
            else s.isBST =  false;
            return s;
        }

	}

	public static void main(String[] args) {
		BinaryTreeFromLvlOrder bt = new BinaryTreeFromLvlOrder();
		System.out.println(bt.isValid());
	}
}
class bstp{
    boolean isBST =  true ;
    long min =  Integer.MAX_VALUE;
    long max =  Integer.MIN_VALUE;
}
 */