import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int i = 0;
		int j = a.length - 1;
		
		reverseIntArratRe(a, i, j);
		System.out.println(Arrays.toString(a));
		
		String a1 = "a green apple";
		char[] b = a1.toCharArray();
		int i1 = 0;
		int j1 = b.length - 1;
		reverseStrRe(b, i1, j1);
		for (int k = 0; k < b.length - 1; k++)
			System.out.print(b[k]);
		System.out.println(b[b.length - 1]);
		
	}

	public static int reverseIntArratRe(int[] a, int i, int j) {
		if(i > j)
			return 0;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return reverseIntArratRe(a, i + 1, j - 1);		
	}
	
	public static int reverseStrRe(char[] b, int i, int j) {
		if(i > j)
			return 0;
		char temp = b[i];
		b[i] = b[j];
		b[j] = temp;
		return reverseStrRe(b, i + 1, j - 1);		
	}

}
