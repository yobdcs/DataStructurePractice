package leetcode;

public class FactorialTrailingZeroes {

	/*	Given an integer n, return the number of trailing zeroes in n!.
	 */
	
	public static void main(String[] args) {
//		int n = 13;
		int n = 500;

		System.out.println(factorialTrailingZeroes(n));
	}

	private static int factorialTrailingZeroes(int n) {
		int ans = 0;
		while(n > 0)
			ans += n /= 5;

		return ans;
	}
	
}
