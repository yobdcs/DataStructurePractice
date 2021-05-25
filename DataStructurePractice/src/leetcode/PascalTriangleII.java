package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	/*	Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
	 * 
	 * 	In Pascal's triangle, each number is the sum of the two numbers directly above it
	 */
	
	public static void main(String[] args) {
		System.out.println(pascalTriangleII(7));
	}
	
	private static List<Integer> pascalTriangleII(int rowIndex){
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0 ; i <= rowIndex ; i ++) {
			list.add(1);
			for(int j = i - 1 ; j > 0 ; j --)
				list.set(j, list.get(j) + list.get(j - 1));
		}
		return list;
	}

}
