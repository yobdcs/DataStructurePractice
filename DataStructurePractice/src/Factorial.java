
public class Factorial {

	public static void main(String[] args) {
		
		int i = 13;
//		System.out.println(factorialSIM(i));
		System.out.println(factorial(i));

//		System.out.println(perfertTree(4 , 0));
	}

	public static int factorialSIM(int f) {
		if(f == 0)
			return 1;
		for(int i = f ; i > 1 ; i-- )
			f *= i - 1;
		return f;
	}
	
	public static int factorial(int f) {
		System.out.println(f);
		if(f == 0)
			return 1;
		
		return f * factorial(f- 1);
	}
	
	public static int perfertTree(int height, int sum) {
		if(height < 0)
			return sum;
		
		sum += Math.pow(2, height);
		return perfertTree(height - 1, sum);		
	}

}
