package leetcode;

public class PathSum {

	/*	Given the root of a binary tree and an integer targetSum, 
	 * 
	 * 	return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
	 * 
	 * 	A leaf is a node with no children.
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
	
	private static boolean pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;

        if(root.left == null && root.right == null)
			return targetSum == root.val;
        
        return pathSum(root.left, targetSum - root.val) ? true : pathSum(root.right, targetSum - root.val);
//        return pathSum(root.left, targetSum - root.val) || pathSum(root.right, targetSum - root.val);
	}
	
}
