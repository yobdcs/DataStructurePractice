package leetcode;

import java.util.LinkedList;
import java.util.Queue;

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
		if(node == null)
			return 0;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		
		int min = 1;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0 ; i < size ; i ++) {
				node = queue.poll();

				if(node.left == null && node.right == null)
					return min;

				if(node.left != null)
					queue.add(node.left);

				if(node.right != null)
					queue.add(node.right);
			}
			min ++;
		}
		return min;
	}

}
