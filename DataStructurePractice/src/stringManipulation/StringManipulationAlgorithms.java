package stringManipulation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulationAlgorithms {
	
	public int countVowels(String str) {
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
	
	public String reverseString(String str) {
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
	
	public String reverseString2(String str) {
		if(checkStr(str))
			return "";
		
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1 ; i >= 0 ; i --)
			sb.append(str.charAt(i));
		
		return sb.toString();
	}
	
	public String reverseWords(String str) {
		if(checkStr(str))
			return "";
		
		StringBuilder sb = new StringBuilder();
		var strArr = str.strip().split(" ");
		for(int i = strArr.length - 1 ; i >= 0 ; i --)
			sb.append(strArr[i] + " ");
		
		return sb.toString().strip();
	}
	
	public String reverseWords2(String str) {
		if(checkStr(str))
			return "";
		
		var words = str.strip().split(" ");
		Collections.reverse(Arrays.asList(words));

		return String.join(" ", words);
	}

	public boolean rotations2(String str1, String str2) {
		if(str1 == null || str2 == null)
			return false;
			
		return str1.length() == str2.length() && (str1 + str1).contains(str2);
	}
	
	public String removeDuplicates(String str) {
		if(checkStr(str))
			return "";
		
		Set<Character> lhset = new LinkedHashSet<Character>();
		for(char ch : str.toCharArray())
			lhset.add(ch);
		
		StringBuilder sb = new StringBuilder();
		for(char ch : lhset.toArray(new Character[0]))
			sb.append(ch);
			
		return sb.toString();
	}
	
	public String removeDuplicates2(String str) {
		if(checkStr(str))
			return "";
		
		Set<Character> hset = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(hset.contains(ch))
				continue;
			
			hset.add(ch);
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public Character mostRepeatedCharacter(String str) {
		if(checkStr(str))
			throw new IllegalArgumentException();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		char result = ' ';
		for(char ch : str.toCharArray()) {
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.replace(ch, map.get(ch) + 1);
			
			if(map.get(ch) > max) {
				max = map.get(ch);
				result = ch;
			}
		}
		return result;
	}
	
	public String sentenceCapitalization(String str) {
		if(checkStr(str))
			throw new IllegalArgumentException();
		
		StringBuilder sb = new StringBuilder();
		for(String word : str.strip().split(" ")) {
			if(word.isEmpty())
				continue;
			
			sb.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
		}
		return sb.toString().strip();
	}
	
	public String sentenceCapitalization2(String str) {
		if(str == null || str.strip() == "")
			return "";

		var words = str.strip().replaceAll(" +", " ").split(" ");
		for(int i = 0 ; i < words.length ; i ++)
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
		
		return String.join(" ", words);
	}
	
	public boolean checkAnagram(String str1, String str2) {
//		if(str1 == null || str2 == null || str1.length() != str2.length())
		if(str1 == null || str2 == null)
			return false;
		
		var chars1 = str1.toLowerCase().toCharArray();
		var chars2 = str2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		return Arrays.equals(chars1, chars2);
	}
	
	public boolean checkAnagram2(String str1, String str2) {
		int[] freqArr = new int[26];
		
		str1 = str1.toLowerCase();
		for(int i = 0 ; i < str1.length() ; i ++)
			freqArr[str1.charAt(i) - 'a'] ++;
		
		str2 = str2.toLowerCase();
		for(int i = 0 ; i < str2.length() ; i ++) {
			if(freqArr[str2.charAt(i) - 'a'] == 0)
				return false;
				
			freqArr[str2.charAt(i) - 'a'] --;
		}
		return true;
	}
	
	public boolean checkPalindrome(String str) {
		if(str == null)
			return false;
		
		for(int i = 0 ; i < str.length() ; i ++) {
			if(i >= str.length() - i - 1)
				break;
			
			if(str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}	
		return true;
	}
	
	public boolean checkPalindrome2(String str) {	
		if(str == null)
			return false;
		
		var sb = new StringBuilder(str);	
		return str.equals(sb.reverse().toString());
	}
	
	private boolean checkStr(String str) {
		return str == null || str == "";
	}
}
