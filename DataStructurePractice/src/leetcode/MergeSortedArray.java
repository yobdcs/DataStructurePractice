package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	/*	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	 * 
	 * 	The number of elements initialized in nums1 and nums2 are m and n respectively. 
	 * 
	 * 	You may assume that nums1 has a size equal to m + n such that it has enough space to hold 
	 * 	
	 * 	additional elements from nums2.
	 */
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		int m = 3;
		int n = 3;

//		int[] nums1 = {0};
//		int[] nums2 = {1};
//		int m = 0;
//		int n = 1;

		mergeSortedArray(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
		if(nums2.length == 0)
			return;
		
		int i1 = m - 1;
		int i2 = n - 1;		
		for(int i = nums1.length - 1 ; i >= 0 ; i --) {
			if(i2 < 0)
				return;
			
			if(i1 >= 0 && nums1[i1] > nums2[i2])
				nums1[i] = nums1[i1 --];
			else
				nums1[i] = nums2[i2 --];
		}
	}
	
}
