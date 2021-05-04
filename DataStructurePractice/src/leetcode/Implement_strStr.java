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
//		String haystack = "hello";
//		String needle = "el";
		String haystack = "mississippi";
		String needle = "issip";
		
		System.out.println(strStr2(haystack, needle));
	}

	private static int strStr(String haystack, String needle) {
		if(needle.isEmpty())
			return 0;

		int index = -1;
		int j = 0;
		for(int i = 0 ; i < haystack.length() ; i ++) {
			char h = haystack.charAt(i);
			char n = needle.charAt(j);
			if(j > 0 && h != n && 
						haystack.charAt(i - 1) == needle.charAt(j - 1)) {
				i = index;
				j = 0;
				index = -1;
				continue;
			}
			
			if(h == n) {
				if(index == -1)
					index = i;
				
				if(j == needle.length() - 1)
					return i - needle.length() + 1;

				j ++;	
			}
		}
		return -1;
	}
	
	private static int strStr2(String haystack, String needle) {
		if(needle.isEmpty())
			return 0;
		
		for(int i = 0 ; i < haystack.length() ; i ++) {
			if(i + needle.length() <= haystack.length() && haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}
		return -1;
	}
	
}
