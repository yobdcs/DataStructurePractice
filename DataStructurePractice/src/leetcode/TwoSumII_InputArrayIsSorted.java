package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII_InputArrayIsSorted {

	/*	Given an array of integers numbers that is already sorted in non-decreasing order, 
	 * 	
	 * 	find two numbers such that they add up to a specific target number.
	 * 
	 * 	Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, 
	 * 
	 * 	where 1 <= answer[0] < answer[1] <= numbers.length.
	 * 
	 * 	The tests are generated such that there is exactly one solution. You may not use the same element twice.
	 */
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 22;

		System.out.println(Arrays.toString(twoSumII_InputArrayIsSorted(numbers, target)));
	}

	private static int[] twoSumII_InputArrayIsSorted(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0 ; i < numbers.length ; i ++) {
			if(map.containsKey(target - numbers[i]))
				return new int[] {map.get(target - numbers[i]) + 1, i + 1};
			
			map.put(numbers[i], i);
		}
		return null;
	}
	
	private static int[] twoSumII_InputArrayIsSorted2(int[] numbers, int target) {
		int temp = 0;
		for(int i = 0 ; i < numbers.length ; i ++) {
			temp = target - numbers[i];
			for(int j = numbers.length - 1 ; j > i ; j --) {
				if(temp == numbers[j])
					return new int[] {i + 1, j + 1};

				if(temp > numbers[j])
					break;
			}
		}
		return null;
	}
	
	private static int[] twoSumII_InputArrayIsSorted3(int[] numbers, int target) {
		int i = 0, j = numbers.length - 1;
		while(i < j) {
			if(numbers[i] + numbers[j] < target)
				i ++;
			
			if(numbers[i] + numbers[j] > target)
				j --;
			
			if(numbers[i] + numbers[j] == target)
				return new int[] {i + 1, j + 1};
		}
		return null;
	}
	
//	private static int[] twoSumII_InputArrayIsSorted4(int[] numbers, int target) {
//		//binary search
//	}
	
}
