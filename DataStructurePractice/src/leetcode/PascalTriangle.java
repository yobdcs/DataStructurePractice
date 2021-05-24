package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	/*	Given an integer numRows, return the first numRows of Pascal's triangle.
	 * 	
	 * 	In Pascal's triangle, each number is the sum of the two numbers directly above
	 */
	
	public static void main(String[] args) {
		System.out.println(pascalTriangle(6));
	}

	private static List<List<Integer>> pascalTriangle(int numRows){
		List<List<Integer>> tri = new ArrayList<List<Integer>>();
		
		for(int i = 0 ; i < numRows ; i ++) {
			List<Integer> temp = new ArrayList<Integer>();
			
			if(i < 2) {
				for(int j = 0 ; j <= i ; j ++)
					temp.add(1);
				
				tri.add(temp);
				continue;
			}

			temp.add(1);
			for(int j = 0 ; j < i - 1 ; j ++)
				temp.add(tri.get(i - 1).get(j) + tri.get(i - 1).get(j + 1));

			temp.add(1);
			
			tri.add(temp);
		}
		return tri;
	}
	
}
