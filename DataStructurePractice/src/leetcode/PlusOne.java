package leetcode;

import java.util.Arrays;

public class PlusOne {

	/*	Given a non-empty array of decimal digits representing a non-negative integer, 
	 * 
	 * increment one to the integer.
	 * 
	 * The digits are stored such that the most significant digit is at the head of the list, 
	 * 
	 * and each element in the array contains a single digit.
	 * 
	 * You may assume the integer does not contain any leading zero, except the number 0 itself.
	 * 
	 */
	
	public static void main(String[] args) {
//		int[] digits = {1, 2, 3};
		int[] digits = {9, 9};
//		int[] digits = {2, 9, 9};

		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	private static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			int num = digits[i] + 1;

			if(num <= 9) {
				digits[i] = num;
				return digits;
			}

			if(num > 9)
				digits[i] = 0;			
		}
		
		digits = new int[digits.length + 1];
		digits[0] = 1;
		
		return digits;
	}

}
