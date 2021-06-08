package leetcode;

public class ExcelSheetColumnNumber {

	/*	Given a string columnTitle that represents the column title as appear in an Excel sheet, 
	 * 
	 * 	return its corresponding column number.
	 */
	
	public static void main(String[] args) {
//		String str = "A";
		String str = "Z";
//		String str = "ZY";
//		String str = "FXSHRXW";

		System.out.println(excelSheetColumnNumber(str));
	}
	
	private static int excelSheetColumnNumber(String columnTitle) {
		int ans = 0, digit = 1;
		for(int i = columnTitle.length() - 1 ; i >= 0 ; i --) {
			ans += (columnTitle.charAt(i) - 64) * digit;
			digit *= 26;
		}
		return ans;
	}

}
