
public class Palindrome {

	public static void main(String[] args) {
		
		String str = "able was I ere I saw elba";
//		String str = "able was I er I saw elba";		
		char[] chars = str.toCharArray();
		
		int start = 0;
		int end = chars.length - 1;
		System.out.println(isPalindromeR(chars, start, end));
		System.out.println(isPalindromeI(chars, start, end));
	}
	
	public static boolean isPalindromeR(char[] chars, int start, int end) {
		if(start >= end)
			return true;
		
		if(chars[start] != chars[end])
			return false;
		
		return isPalindromeR(chars, start + 1, end - 1);
	}
	
	public static boolean isPalindromeI(char[] chars, int start, int end) {
		while(start < end) {
			if(chars[start ++] != chars[end --])
				return false;			
		}
		return true;
	}

}
