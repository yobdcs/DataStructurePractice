package leetcode;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		int nums[] = {0, 1, 2, 3, 4, 5, 6};
//		int nums[] = {-10, -3, 0, 5, 9};
		
		convertSortedArrayToBinarySearchTree(nums);
	}
	
	public static class TreeNode {
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
	
	private static TreeNode convertSortedArrayToBinarySearchTree(int[] nums) {
		int mid = nums.length / 2;
		return append(0, nums.length - 1, mid, nums, new TreeNode(nums[mid]));
	}
	
	private static TreeNode append(int begin, int end, int mid, int[] nums, TreeNode root) {
		if(begin >= end)
			return null;
        
        if(begin <= mid - 1)
		    root.left = append(begin, mid - 1, mid / 2, nums, new TreeNode(nums[mid / 2]));
        
        if(mid + 1 <= end)
            root.right = append(mid + 1, end, (mid + 1 + end) / 2, nums, new TreeNode(nums[(mid + 1 + end) / 2]));
		
		return root;
	}

}
