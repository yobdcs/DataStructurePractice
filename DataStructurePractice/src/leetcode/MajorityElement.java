package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	/*	Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
	 * 
	 * You may assume that the majority element always exists in the array.
	 */
	
	public static void main(String[] args) {
//		int[] nums = {3, 2, 3};
		int[] nums = {2, 2, 2, 3, 1, 2, 2, 1, 1};
		
		System.out.println(majorityElement2(nums));
	}
	
	private static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int len = nums.length / 2;
		for(var num : nums) {
			if(map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
			
			if(map.get(num) > len)
				return num;
		}
		return 0;
	}
	
	private static int majorityElement2(int[] nums) {
		int ans = nums[0], freq = 0;
		for(int i = 0 ; i < nums.length ; i ++) {
			if(ans == nums[i])
				freq += 1;
			else {
				freq -= 1;
				if(freq == 0)
					ans = nums[i + 1];				
			}		
		}
		return ans;
	}

}
