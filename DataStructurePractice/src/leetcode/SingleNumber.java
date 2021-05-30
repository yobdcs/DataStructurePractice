package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	/*	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	 * 
	 * 	You must implement a solution with a linear runtime complexity and use only constant extra space.
	 */
	
	public static void main(String[] args) {
		int[] nums = {1, 4, 2, 1, 2};
//		int[] nums = {2, 2, 1};

		System.out.println(singleNumber2(nums));
	}
	
	private static int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int n : nums) {
			if(set.contains(n))
				set.remove(n);
            else
			    set.add(n);
		}
		return set.iterator().next();
	}

	private static int singleNumber2(int[] nums) {
		int result = 0;
		for(int i : nums)
			result ^= i;
		
		return result;
	}
	
}
