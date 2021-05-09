package leetcode;

public class Sqrt {

	/*	Given a non-negative integer x, compute and return the square root of x.
	 * 	
	 * 	Since the return type is an integer, the decimal digits are truncated, 
	 * 
	 * 	and only the integer part of the result is returned.
	 */
	
	public static void main(String[] args) {
		int x = 2147395600;
//		int x = 8;

		System.out.println(sqrt2(x));
	}
	
	private static int sqrt(int x) {
		long i = 0;
		while(i * i <= x)
			i ++;
		
		return (int)i - 1;
	}

	private static int sqrt2(int x) {
	    long r = x;
	    while (r * r > x)
	        r = (r + x/r) / 2;
	    
	    return (int) r;
	}

}
