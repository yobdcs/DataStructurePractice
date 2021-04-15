package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] a = {2, 4, 5, 6};
//		int[] a = {3, 2, 4};
//		int[] a = {3, 3};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(a, target)));
	}
	
	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] ans = new int[2];
		for(int i = 0 ; i < nums.length ; i ++) {
			if(map.containsKey(target - nums[i])) {
				ans[0] = map.get(target - nums[i]);
				ans[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		return ans;
	}

}
