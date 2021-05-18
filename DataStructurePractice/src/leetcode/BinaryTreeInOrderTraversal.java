package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

	/*	Given the root of a binary tree, return the inorder traversal of its nodes' values.
	 * 	
	 * 	Definition for a binary tree node.
	 */
	
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

	public static void main(String[] args) {

	}
	
	private static List<Integer> binaryTreeInOrderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		
		inOrderT(list, root);
//		inOrderI(list, root);
		
		return list;
	}
	
	private static void inOrderT(List<Integer> list, TreeNode node) {
		if(node == null)
			return;
		
		inOrderT(list, node.left);
		list.add(node.val);
		inOrderT(list, node.right);
	}

	private static void inOrderI(List<Integer> list, TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(node != null) {
			stack.push(node);
			node = node.left;
			
			while(node == null && !stack.isEmpty()) {
				node = stack.pop();
				list.add(node.val);
				node = node.right;
			}
		}
	}

}
