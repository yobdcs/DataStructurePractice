package leetcode;

public class ReverseBits {

	/*	Reverse bits of a given 32 bits unsigned integer.
	 */
	
	public static void main(String[] args) {
//		int n = 43261596;
		int n = -3;
		
		System.out.println(reverseBits2(n));
	}

	private static int reverseBits(int n) {
		StringBuilder sb = new StringBuilder();
		
		int a = n;
		if(n < 0)
			a = -(a + 1) ^ Integer.MAX_VALUE;

		int i = 0;
		while(i < 31) {
			sb.append(a % 2);
			
			a /= 2;
			i ++;
		}
		
		i = 0;
		if(n < 0)
			sb.append(1);
		else
			sb.append(0);
		
		int digit = 1;
		for(int j = sb.length() - 1 ; j > 0 ; j --) {
			i += Character.getNumericValue(sb.charAt(j)) * digit;
			digit *= 2;
		}
	
		if(sb.charAt(0) == '1')
			return -((i - 1) ^ Integer.MAX_VALUE);
		
		return i;
	}
	
	private static int reverseBits2(int n) {
		return Integer.reverse(n);
	}
	
}
