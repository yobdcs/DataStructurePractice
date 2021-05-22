package leetcode;

public class MaximumDepthOfBinaryTree {

	/*	Given the root of a binary tree, return its maximum depth.
	 * 	
	 * 	A binary tree's maximum depth is the number of nodes along the longest path from the root node 
	 * 
	 * 	down to the farthest leaf node.
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
	
	private static int maximumDepthOfBinaryTree(TreeNode node) {
		return postOrder(node);
	}

	private static int postOrder(TreeNode node) {
		if(node == null)
			return 0;
		
		return Math.max(postOrder(node.left) + 1, postOrder(node.right) + 1);
	}

}
