package leetcode;

public class ValidPalindrome {

	/*	Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
	 */
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
//		String s = "race a car";
		
		System.out.println(validPalindrome2(s));
	}
	
	private static boolean validPalindrome(String s) {
		String str = s.trim().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		return str.equals(sb.reverse().toString());
	}

	private static boolean validPalindrome2(String s) {
		int j = s.length() - 1;
		for(int i = 0 ; i < j ; i ++) {
			char front = s.charAt(i);
			if(front < 48 || front > 57 && front < 65 || front > 90 && front < 97 || front > 122)
				continue;
			
			if(front > 64 && front < 91)
				front += 32;
			
			char back = s.charAt(j);
			while(back < 48 || back > 57 && back < 65 || back > 90 && back < 97 || back > 122)
				back = s.charAt(-- j);

			if(back > 64 && back < 91)
				back += 32;

			if(front != back)
				return false;
			
			j --;
		}
		return true;
	}

}
