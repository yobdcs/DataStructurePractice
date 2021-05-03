package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

	/* Write a function to find the longest common prefix string amongst an array of strings.

	   If there is no common prefix, return an empty string "".
	*/
	
	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
//		String[] strs = {"dog" ,"racecar" ,"car"};

		System.out.println(longestCommonPrefix2(strs));
	}
	
	private static String longestCommonPrefix(String[] strs) {		
		int min = strs[0].length();
		for(int i = 0 ; i < strs.length ; i ++) {
			if(i != 0 && strs[i].length() < min)
				min = strs[i].length();
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		char ch = 0;
		for(int j = 0 ; j < min ; j ++) {
			for(int i = 0 ; i < strs.length ; i ++) {				
				ch = strs[i].charAt(j);
				if(map.containsKey(ch)) {
					map.replace(ch, map.get(ch) + 1);
					continue;
				}
				map.put(ch, 1);
			}			
			if(map.get(ch) != strs.length)
				break;
			
			sb.append(ch);
			map.replace(ch, 0);
		}
		return sb.toString();
	}
	
	private static String longestCommonPrefix2(String[] strs) {
		int min = strs[0].length();
		int index = 0;
		for(int i = 0 ; i < strs.length ; i ++) {			
			if(i != 0 && strs[i].length() < min) {
				min = strs[i].length();
				index = i;
			}
		}
		
		if(min == 0)
			return "";
		
		String check = strs[index];
		for(int i = 0 ; i < strs.length ; i ++) {
			if(i == index)
				continue;
			
			if(!strs[i].substring(0, check.length()).equals(check)) {
				check = check.substring(0, check.length() - 1);
				i = -1;
			}
		}
		return check;
	}

}
