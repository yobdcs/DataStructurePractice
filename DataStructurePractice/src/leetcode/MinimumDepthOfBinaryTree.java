package leetcode;

public class MinimumDepthOfBinaryTree {

	/*	Given a binary tree, find its minimum depth.
	 * 
	 * 	The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	 * 
	 * 	Note: A leaf is a node with no children.
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
	
	private static int dfsApproach(TreeNode node) {
		if(node == null)
			return 0;
		
		int lh = dfsApproach(node.left);
		int rh = dfsApproach(node.right);

		if(lh == 0 && rh == 0)
			return 1 + Math.min(lh, rh);
		
		return 1 + Math.max(lh, rh);
	}
	
	private static int bfsApproach(TreeNode node) {
		
		return 0;
	}

}
