public class Test {

	public static void main(String[] args) {
		
		int num = 13531;
		int i = 1;
		StringBuilder sb = new StringBuilder();
		System.out.println(toInteger(num, i, sb));
		
		int j = 0;
		int[] ints = {72, 55, 82, 35, 72, 42, 65};
		int temp = ints[0];
		System.out.println(maxV(ints, j, temp));
	}

	private static String toInteger(int num, int i, StringBuilder sb) {
		if(num == 0)
			return sb.toString();
		
		if(i == 3)
			sb.append(",");
		
		return toInteger(num / 10, i + 1, sb.append(num % 10));
		
	}
	
	private static int maxV(int[] ints, int j, int temp) {
		if(j == ints.length - 1)
			return temp;
		return maxV(ints, j + 1, Math.max(temp, ints[j + 1]));
	}

}
