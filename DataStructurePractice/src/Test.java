public class Test {

	public static void main(String[] args) {
		var time1 = System.nanoTime();
		multitable(1, 1);
		var time2 = System.nanoTime();
		
//		var time1 = System.nanoTime();
//		multitable2();
//		var time2 = System.nanoTime();

		System.out.println(time2 - time1);
	}
	
	private static void multitable(int i, int j) {
		if(i > 9)
			return;
			
		if(j > 9) {
			multitable(i + 1, 1);
			return;
		}

		System.out.println(i + "*" + j + "=" + i * j);
		multitable(i, j + 1);
	}

	private static void multitable2() {
		for(int i = 1 ; i <= 9 ; i ++) {
			for(int j = 1 ; j <= 9 ; j ++)
				System.out.println(i + "*" + j + "=" + i * j);
		}
	}
	
}