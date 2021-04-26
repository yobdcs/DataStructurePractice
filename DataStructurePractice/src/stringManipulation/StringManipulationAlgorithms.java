package stringManipulation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulationAlgorithms {
	
	public int CountVowels(String str) {
		if(checkStr(str))
			return 0;
		
		var vows = "aeiou";
		
		Set<Character> set = new HashSet<Character>();
		for(var vow : vows.toCharArray())
			set.add(vow);
		
		var count = 0;
		for(var ch : str.toLowerCase().toCharArray()) {
			if(set.contains(ch))
				count ++;
		}
		return count;
	}
	
	public String ReverseString(String str) {
		if(checkStr(str))
			return "";
		
		Deque<Character> stack = new ArrayDeque<Character>();
		for(var ch : str.toCharArray())
			stack.push(ch);
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty())
			sb.append(stack.pop());
		
		return sb.toString();
	}
	
	public String ReverseString2(String str) {
		if(checkStr(str))
			return "";
		
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1 ; i >= 0 ; i --)
			sb.append(str.charAt(i));
		
		return sb.toString();
	}
	
	public String ReverseWords(String str) {
		if(checkStr(str))
			return "";
		
		StringBuilder sb = new StringBuilder();
		var strArr = str.strip().split(" ");
		for(int i = strArr.length - 1 ; i >= 0 ; i --)
			sb.append(strArr[i] + " ");
		
		return sb.toString().strip();
	}
	
	public String ReverseWords2(String str) {
		if(checkStr(str))
			return "";
		
		var words = str.strip().split(" ");
		Collections.reverse(Arrays.asList(words));

		return String.join(" ", words);
	}

	public boolean Rotations2(String str1, String str2) {
		if(str1 == null || str2 == null)
			return false;
			
		return str1.length() == str2.length() && (str1 + str1).contains(str2);
	}
	
	private boolean checkStr(String str) {
		return str == null || str == "";
	}
}
