package balance;

public class BalanceTest {

	public static void main(String[] args) {
		String str = "([123])";
		Expression ib = new Expression(str);
		System.out.println(ib.isBalanced());
	
	}
}
