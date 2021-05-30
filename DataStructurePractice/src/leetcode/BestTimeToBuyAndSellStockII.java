package leetcode;

public class BestTimeToBuyAndSellStockII {

	/*	You are given an array prices where prices[i] is the price of a given stock on the ith day.
	 * 
	 * 	Find the maximum profit you can achieve. You may complete as many transactions as you like 
	 * 
	 * 	(i.e., buy one and sell one share of the stock multiple times).
	 * 
	 * 	Note: You may not engage in multiple transactions simultaneously 
	 * 
	 * 	(i.e., you must sell the stock before you buy again).
	 */
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
//		int[] prices = {1, 2, 3, 4, 5};
//		int[] prices = {6, 1, 3, 2, 4, 7};
		
		System.out.println(bestTimeToBuyAndSellStockII(prices));
	}
	
	private static int bestTimeToBuyAndSellStockII(int[] prices) {
		int max = 0;
		for(int i = 1 ; i < prices.length ; i ++) {
			if(prices[i] > prices[i - 1])
				max = max + (prices[i] - prices[i - 1]);
		}
		return max;
	}

}
