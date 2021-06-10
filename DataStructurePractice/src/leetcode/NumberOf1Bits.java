package leetcode;

public class NumberOf1Bits {

	/*	Write a function that takes an unsigned integer and returns the number of '1' bits it has 
	 * 
	 * 	(also known as the Hamming weight).
	 */
	
	public static void main(String[] args) {
//		int n = 1;
		int n = -3;
//		int n = 11;
		
		System.out.println(numberOf1Bits2(n));
	}
	
	private static int numberOf1Bits(int n) {
		int ans = 0;
		for(int i = 0 ; i < 32 ; i ++) {
			if((n & 1) != 0)
				ans ++;
			
			n >>>= 1;
		}
		return ans;
	}
	
	private static int numberOf1Bits2(int n) {
		int ans = 0;
		for(int i = 0 ; i < 32 ; i ++) {
			ans += (n & 1);
			n >>>= 1;
		}
		return ans;
	}

}
