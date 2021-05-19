package leetcode;

public class SameTree {

	/*	Given the roots of two binary trees p and q, write a function to check if they are the same or not.
	 * 
	 * 	Two binary trees are considered the same if they are structurally identical, 
	 * 
	 * 	and the nodes have the same value.
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
	
	private static boolean sameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		
		if(p == null && q != null || p != null && q == null || p.val != q.val)
			return false;
		
		return sameTree(p.left, q.left) && sameTree(p.right, q.right);
	}

}
