package leetcode;

public class HappyNumber {

	/*	Write an algorithm to determine if a number n is happy.
	 * 
	 * 	A happy number is a number defined by the following process:
	 * 
	 * 	Starting with any positive integer, replace the number by the sum of the squares of its digits.
	 * 
	 * 	Repeat the process until the number equals 1 (where it will stay), 
	 * 
	 * 	or it loops endlessly in a cycle which does not include 1.
	 * 
	 * 	Those numbers for which this process ends in 1 are happy.
	 * 
	 * 	Return true if n is a happy number, and false if not.
	 */
	
	public static void main(String[] args) {
//		int n = 19;
		int n = 84;

		System.out.println(happyNumber(n));
	}
	
	private static boolean happyNumber(int n) {
		int temp = 0;
		while(n != 0) {
			temp += (n % 10) * (n % 10);
			n /= 10;
		}

		if(temp / 10 == 0) {	
			if(temp == 1 || temp == 7)
				return true;
			
			return false;
		}
		return happyNumber(temp);
	}

}
