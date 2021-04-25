package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
//		String s = "abccccdd"; 
//		String s = "Aa"; 
//		String s = "ccc";
		String s = "ababa";
		System.out.println(longestPalindrome(s));
	}

	private static int longestPalindrome(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(var ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				continue;
			}
			map.put(ch, 1);
		}
		
		int len = 0;
		var flag = 0;
		for(var entry : map.entrySet()) {
			var key = entry.getKey();
			if(map.get(key) % 2 != 0 && flag ++ == 0) {
				len += map.get(key);
				continue;
			}

			if(map.get(key) % 2 != 0)
				len += map.get(key) - 1;			
			
			if(map.get(key) % 2 == 0 && map.get(key) != 1)
				len += map.get(key);
		}
		return len;
	}
}
