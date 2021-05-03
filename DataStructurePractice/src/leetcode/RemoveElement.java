package leetcode;

public class RemoveElement {

	/*	Given an array nums and a value val, remove all instances of that value in-place and return the 
	 * 
	 * 	new length.
	 * 	
	 * 	Do not allocate extra space for another array, you must do this by modifying the input array in-place 
	 * 
	 *  with O(1) extra memory.
	 *  
	 *  The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     */
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//		int[] nums = {1, 1, 2};
		
		int val = 2;
		
		int len = removeElement(nums, val);
		for(int i = 0 ; i < len ; i ++)
			System.out.print(nums[i] + " ");
	}
	
	private static int removeElement(int[] nums, int val) {
		int count = nums.length;
		for(int i = 0 ; i < count ; i ++) {
			if(nums[i] == val) {
				count --;
				
				while(i != count && nums[count] == val)
					count --;
				
				nums[i] = nums[count];
			}
		}
		return count;
	}
	
	private static int removeElement2(int[] nums, int val) {
		int count = 0;
		for(int i = 0 ; i < nums.length ; i ++) {
			if(nums[i] != val)
				nums[count ++] = nums[i];
		}
		return count;
	}

}
