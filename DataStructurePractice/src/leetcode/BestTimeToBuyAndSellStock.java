package leetcode;

public class BestTimeToBuyAndSellStock {

	/*	You are given an array prices where prices[i] is the price of a given stock on the ith day.
	 * 
	 * 	You want to maximize your profit by choosing a single day to buy one stock and 
	 * 
	 * 	choosing a different day in the future to sell that stock.
	 * 
	 * 	Return the maximum profit you can achieve from this transaction. 
	 * 
	 * 	If you cannot achieve any profit, return 0.
	 */
	
	public static void main(String[] args) {
//		int[] prices = {7, 1, 5, 3, 6, 4};
//		int[] prices = {7, 6, 4, 3, 1};
		int[] prices = {2, 4, 1};
		
		System.out.println(bestTimeToBuyAndSellStock2(prices));
	}
	
	private static int bestTimeToBuyAndSellStock(int[] prices) {
		int max = 0;
		
		for(int i = 0 ; i < prices.length ; i ++) {	
			for(int j = i + 1 ; j < prices.length ; j ++) {
				if(prices[i] < prices[j])
					max = Math.max(max, prices[j] - prices[i]);
			}
		}	
		return max;
	}
	
	private static int bestTimeToBuyAndSellStock2(int[] prices) {
		int min = prices[0];
		int max = prices[0];
		int value = 0;
		for(int i = 1 ; i < prices.length ; i ++) {
			if(prices[i] > max) {
				max = prices[i];
				value = Math.max(value, max - min);
			}
			
			if(prices[i] < min)
				max = min = prices[i];
		}	
		return value;
	}

}
