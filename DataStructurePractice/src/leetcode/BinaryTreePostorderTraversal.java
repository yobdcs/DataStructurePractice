package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

	/*	Given the root of a binary tree, return the preorder traversal of its nodes' values.
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
	
	public static List<Integer> binaryPostorderTraversal(TreeNode root){
		List<Integer> list = new LinkedList<Integer>();
		postOrderR(root, list);
		return list;
	}

	private static void postOrderR(TreeNode node, List<Integer> list) {
		if(node == null)
			return;
		
		postOrderR(node.left, list);
		postOrderR(node.right, list);
		list.add(node.val);
	}
	
	public static List<Integer> binaryPostorderTraversal2(TreeNode root){
		LinkedList<Integer> list = new LinkedList<Integer>();

		if(root == null)
			return list;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();

			list.addFirst(node.val);
			
			if(node.left != null)
				stack.push(node.left);
			
			if(node.right != null)
				stack.push(node.right);
		}
		return list;
	}
	
}
