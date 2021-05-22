package leetcode;

public class BalancedBinaryTree {

	/*	Given a binary tree, determine if it is height-balanced.
	 * 	
	 * 	For this problem, a height-balanced binary tree is defined as:
	 * 
	 * 	a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
	 */
	
	public static void main(String[] args) {
		
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	private static boolean balancedBinaryTree(TreeNode root) {
		return postOrder(root) != -1;
	}
	
	private static int postOrder(TreeNode node) {
		if(node == null)
			return 0;
	
		int lh = postOrder(node.left);
		int rh = postOrder(node.right);
		
		if(lh == -1 || rh == -1 || Math.abs(lh - rh) > 1)
			return -1;
		
		return 1 + Math.max(lh, rh);
	}
}
