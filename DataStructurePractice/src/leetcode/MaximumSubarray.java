package leetcode;

public class MaximumSubarray {

	/*	Given an integer array nums, find the contiguous subarray (containing at least one number) 
	 * 
	 * 	which has the largest sum and return its sum.
	 */
	
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//		int[] nums = {5, 4, -1, 7, 8};
//		int[] nums = {5, -1};

		System.out.println(maximumSubarray(nums));
	}
	
	private static int maximumSubarray(int[] nums) {
		int temp = 0;
		int max = nums[0];
		for(int i = 0 ; i < nums.length ; i ++) {
			temp = nums[i];
			
			if(temp > max)
				max = temp;
			
			for(int j = i + 1 ; j < nums.length ; j ++) {
				temp += nums[j];
				if(temp > max)
					max = temp;
			}
		}
		return max;
	}

	private static int maximumSubarray2(int[] nums) {
		int temp = nums[0];
		int max = nums[0];
		for(int i = 1 ; i < nums.length ; i ++) {
			int num = nums[i];
			if(temp + num > num)
				temp += num;
			else
				temp = num;
			
			if(temp > max)
				max = temp;
		}
		return max;
	}
	
}
