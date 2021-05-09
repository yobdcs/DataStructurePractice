package leetcode;

public class AddBinary {

	/*	Given two binary strings a and b, return their sum as a binary string.
	 */
	
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";

		System.out.println(addBinary2(a, b));
	}
	
	private static String addBinary(String a, String b) {
		String strS;
		String strL;
		if(a.length() > b.length()) {
			strS = b;
			strL = a;			
		} else {
			strS = a;
			strL = b;			
		}
		
		StringBuilder sb = new StringBuilder(strL);
		
		int j = sb.length();
		int carry = 0;
		for(int i = strS.length() - 1 ; i >= 0 ; i --) {
			int temp = carry + Character.getNumericValue(strS.charAt(i)) + Character.getNumericValue(sb.charAt(j - 1));
			if(temp > 1)
				carry = 1;
			else
				carry = 0;

			sb.replace(j - 1, j, Integer.toString(temp % 2));
			j --;
		}

		for(int i = sb.length() - strS.length() - 1 ; i >= 0 ; i --) {
			int temp = carry + Character.getNumericValue(sb.charAt(i));
			if(temp > 1)
				carry = 1;
			else
				carry = 0;
			
			sb.replace(i, i + 1, Integer.toString(temp % 2));
		}
		
		if(carry == 1) {
			StringBuilder sb2 = new StringBuilder();
			sb2.append(1);
			sb2.append(sb.toString());
			return sb2.toString();
		}
		
		return sb.toString();
	}
	
	private static String addBinary2(String a, String b) {
		String strS;
		String strL;
		if(a.length() > b.length()) {
			strS = b;
			strL = a;			
		} else {
			strS = a;
			strL = b;			
		}
		
		StringBuilder sb = new StringBuilder();
		
		int j = strL.length();
		int carry = 0;
		for(int i = strS.length() - 1 ; i >= 0 ; i --) {
			int temp = carry + (strS.charAt(i) - '0') + (strL.charAt(j - 1) - '0');

			sb.append(temp % 2);
			carry = temp / 2;
			j --;
		}
		
		for(int i = strL.length() - strS.length() - 1 ; i >= 0 ; i --) {
			int temp = carry + (strL.charAt(i) - '0');

			sb.append(temp % 2);
			carry = temp / 2;
		}
		
		if(carry == 1)
			sb.append(1);
		
		return sb.reverse().toString();
	}

}
