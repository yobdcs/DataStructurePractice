package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1, 1, 3};
//		int[] a = {1, 1, 1, 1};
		System.out.println(numberOfGoodPairs(a));
	}
	
	private static int numberOfGoodPairs(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int gp = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
				continue;
			}
			map.put(array[i], 1);
		}
		
		for(var entry : map.entrySet()) {
			var n = map.get(entry.getKey()) - 1;
			gp += (1 + n) * n / 2;
		}
		
		return gp;
	}

}
