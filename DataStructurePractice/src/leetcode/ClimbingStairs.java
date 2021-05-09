package leetcode;

import java.math.BigInteger;

public class ClimbingStairs {

	/*	You are climbing a staircase. It takes n steps to reach the top.
	 * 
	 * 	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	 */
	
	public static void main(String[] args) {
		int n = 5;

		System.out.println(climbingStairs(n));
	}

	private static int climbingStairs(int n) {
		BigInteger total = BigInteger.valueOf(0);
		for(int i = 0 ; i <= n / 2 ; i ++)
			total = total.add(f(n - i).divide((f(i).multiply(f(n - i - i)))));

		return total.intValue();
	}
	
	private static BigInteger f(int num) {
		BigInteger ans = BigInteger.valueOf(1);
		while(num > 0)
			ans = ans.multiply(BigInteger.valueOf(num --));

		return ans;
	}
	
}
