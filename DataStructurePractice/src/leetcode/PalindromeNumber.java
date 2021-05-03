package leetcode;

public class PalindromeNumber {

	/*  Given an integer x, return true if x is palindrome integer.

		An integer is a palindrome when it reads the same backward as forward. 
		
		For example, 121 is palindrome while 123 is not.
	*/

	public static void main(String[] args) {
		int x = 121;

		System.out.println(palindromeNumber(x));
	}

	private static boolean palindromeNumber(int x) {
		if(x < 0)
			return false;
		
		int temp = x;
		int reverse = 0;
		while(temp != 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}

		return x == reverse;
	}
	
}
