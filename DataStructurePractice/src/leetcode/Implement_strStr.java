package leetcode;

public class Implement_strStr {

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
