package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

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
	
	public static List<Integer> binaryTreePreorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		preOrderR(root, list);
		return list;
	}

	private static void preOrderR(TreeNode node, List<Integer> list) {
		if(node == null)
			return;
		
		list.add(node.val);
		preOrderR(node.left, list);
		preOrderR(node.right, list);
	}
	
	public static List<Integer> binaryTreePreorderTraversal2(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();

		if(root == null)
			return list;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			
			list.add(node.val);
			
			if(node.right != null)
				stack.push(node.right);
			
			if(node.left != null)
				stack.push(node.left);
		}
		return list;
	}
	
}
