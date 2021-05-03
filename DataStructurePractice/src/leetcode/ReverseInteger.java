package leetcode;

public class ReverseInteger {

	/*Given a signed 32-bit integer x, return x with its digits reversed. 
 
 		If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
 
 		then return 0.
 	*/
	
	public static void main(String[] args) {
//		int x = 321;
//		int x = -25;
		int x = -2147483647;
		
		System.out.println(reverseInteger(x));
	}
	
	private static int reverseInteger(int x) {		
		long num = 0;
		while(x != 0) {
			num = num * 10 + x % 10;
			x /= 10;
		}

		if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
			return 0;

		return (int) num;
	}

}
