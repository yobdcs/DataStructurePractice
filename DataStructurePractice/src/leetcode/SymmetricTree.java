package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class SymmetricTree {

	/*	Given the root of a binary tree, check whether it is a mirror of itself 
	 * 
	 * 	(i.e., symmetric around its center).
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
	
	private static boolean symmetricTree(TreeNode node) {
        if(node.left == null && node.right == null)
            return true;
        
        if(node.left == null || node.right == null)
            return false;
        
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		preOrderL(queue, node.left);
		return checkR(queue, node.right) && queue.isEmpty();
	}
	
	private static void preOrderL(Queue<Integer> queue, TreeNode node) {
		if(node == null) {
			queue.add(0);
			return;
		}
		
		queue.add(node.val);
		preOrderL(queue, node.left);
		preOrderL(queue, node.right);
	}

	private static boolean checkR(Queue<Integer> queue, TreeNode node) {
		if(node == null) {
			queue.poll();
			return true;
		}
		
		if(node.val != queue.poll())
			return false;
		
		return checkR(queue, node.right) && checkR(queue, node.left);
	}
	
	private static boolean symmetricTree2(TreeNode node) {
		return preOrder2(node.left, node.right);
	}
	
	private static boolean preOrder2(TreeNode left, TreeNode right) {		
		if(left == null && right == null)
			return true;
		
		if(left != null && right == null || left == null && right != null || left.val != right.val)
			return false;
		
		return preOrder2(left.left, right.right) && preOrder2(left.right, right.left);
	}
	
}
