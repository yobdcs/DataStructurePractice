package leetcode;

public class Implement_strStr {
	
	/*	Implement strStr().

		Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

		Clarification:

		What should we return when needle is an empty string? This is a great question to ask during an interview.

		For the purpose of this problem, we will return 0 when needle is an empty string. 
		
		This is consistent to C's strstr() and Java's indexOf().
	*/

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "el";
		
		System.out.println(strStr(haystack, needle));
	}

	private static int strStr(String haystack, String needle) {
		if(needle.isEmpty())
			return 0;
		
		int index = 0;
		int j = 0;
		for(int i = 0 ; i < haystack.length() ; i ++) {
			if(haystack.charAt(i) == needle.charAt(j)) {
				if(j == needle.length() - 1 && needle.length() == 1)
					return i;
				
				if(j == needle.length() - 1)
					return index;
				
				index = i;
				j ++;
			}
		}
		return -1;
	}
	
}
