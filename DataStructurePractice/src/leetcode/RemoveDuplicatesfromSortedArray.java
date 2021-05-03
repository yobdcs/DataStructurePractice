package leetcode;

public class RemoveDuplicatesfromSortedArray {

	/*	Given a sorted array nums, remove the duplicates in-place such that each element appears only once 
	 * 
	 * 	and returns the new length.
	 * 
	 * 	Do not allocate extra space for another array, you must do this by modifying the input array in-place 
	 * 
	 * 	with O(1) extra memory.
	 */
	
	public static void main(String[] args) {
//		int[] nums = {1, 1, 2, 3, 3, 4};
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		
		int len = removeDuplicatesFromSortedArray(nums);
		for(int i = 0 ; i < len ; i ++)
			System.out.println(nums[i]);
	}

	private static int removeDuplicatesFromSortedArray(int[] nums) {		
		int count = 1;
		for(int i = 0 ; i < nums.length ; i ++) {
			if(i != 0 && nums[i] != nums[i - 1])
				nums[count ++] = nums[i];
		}		
		return count;
	}
	
}
