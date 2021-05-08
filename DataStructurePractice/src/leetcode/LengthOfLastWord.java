package leetcode;

public class LengthOfLastWord {

	/*	Given a string s consists of some words separated by spaces, return the length of the last word 
	 * 
	 * in the string. If the last word does not exist, return 0.

		A word is a maximal substring consisting of non-space characters only.
	*/
	
	public static void main(String[] args) {
		String s = "hello world ";
		
		System.out.println(lengthOfLastWord2(s));
	}
	
	private static int lengthOfLastWord(String s) {
		if(s.isEmpty())
			return 0;
		
		String[] words = s.split(" ");
		if(words.length == 0)
			return 0;
		
		return words[words.length - 1].length();
	}
	
	private static int lengthOfLastWord2(String s) {
		s = s.strip();
		
		if(s.isEmpty())
			return 0;
		
		int len = 0;
		for(int i = s.length() - 1 ; i >= 0 ; i --) {
			if(s.charAt(i) == ' ')
				break; 
			
			len ++;
		}
		return len;
	}

}
