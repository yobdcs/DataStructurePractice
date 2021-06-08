package leetcode;

public class ExcelSheetColumnTitle {

	/*	Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
	 */
	
	public static void main(String[] args) {
//		int columnNumber = 1;
		int columnNumber = 701;
//		int columnNumber = 2147483647;
		
		System.out.println(excelSheetColumnTitle2(columnNumber));
	}

	private static String excelSheetColumnTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		
		getChar(columnNumber, sb);
		
		return sb.toString();
	}
	
	private static void getChar(int num, StringBuilder sb) {
		int result = num / 26;
		int remain = num % 26;
		
		if(remain == 0) {
			result -= 1;
			remain = 26;
		}
		
		if(result < 27) {
			if(result > 0)
				sb.append((char) (result + 64));
			
			sb.append((char) (remain + 64));	
			return;
		} else
			getChar(result, sb);

		sb.append((char) (remain + 64));
	}
	
	private static String excelSheetColumnTitle2(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while(columnNumber > 0) {
			sb.append((char) ((columnNumber - 1) % 26 + 65));
			columnNumber = (columnNumber - 1) / 26;
		}
		
		return sb.reverse().toString();
	}

}
