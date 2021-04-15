package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

	public static void main(String[] args) {
//		int[] a = {1, 2, 3, 2};
		int[] a = {1, 1, 1, 1, 1};
//		int[] a = {1, 2, 3, 4, 5};
		System.out.println(sumOfUniqueElements(a));
	}
	
	private static int sumOfUniqueElements(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i ++) {
			if(map2.containsKey(nums[i]))
				continue;
			
			if(map.containsKey(nums[i])) {
				map.remove(nums[i]);
				sum -= nums[i];
				map2.put(nums[i], i);
				continue;
			}
			
			sum += nums[i];
			map.put(nums[i], i);
		}
		return sum;
	}

}
