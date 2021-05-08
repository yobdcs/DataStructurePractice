package leetcode;

public class SearchInsertPosition {

	/*	Given a sorted array of distinct integers and a target value, 
	 * 
	 * 	return the index if the target is found. If not, return the index where it would be 
	 * 
	 * 	if it were inserted in order.
	 */
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
//		int target = 5;
		int target = 2;
//		int target = 7;

		System.out.println(searchInsertPosition(nums, target));
	}

	private static int searchInsertPosition(int[] nums, int target) {
		for(int i = 0 ; i < nums.length ; i ++) {
			if(target <= nums[i])
				return i;
		}
		return nums.length;
	}
	
}
