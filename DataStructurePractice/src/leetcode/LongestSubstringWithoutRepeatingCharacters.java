package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
//		String str = "abcabcbb";
//		String str = "pwwkew";
		String str = "dvdx";
//		String str = "bbbbb";

		System.out.println(lengthOfLongestSubstring(str));
	}
	
	public static int lengthOfLongestSubstring(String str) {
		if(str.isEmpty() || str == null)
			return 0;
		
		char[] chs = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        int max = 1;
        for(int i = 0 ; i < str.length() ; i ++) {
       		if(map.containsKey(chs[i])) {
        		if(max < map.size())
        			max = map.size();

        		i = map.get(chs[i]) + 1;
        		map.clear();
        	}
        	map.put(chs[i], i);
        }

		if(max < map.size())
			max = map.size();

        return max;
    }

}
