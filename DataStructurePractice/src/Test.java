public class Test {

	public static void main(String[] args) {

		long data = 21474836;
		
		var a = longtoBytes(data);

		System.out.println(4);
		
	}
	
	private static byte[] longtoBytes(long data) {
		 return new byte[]{
		 (byte) ((data >> 56) & 0xff),
		 (byte) ((data >> 48) & 0xff),
		 (byte) ((data >> 40) & 0xff),
		 (byte) ((data >> 32) & 0xff),
		 (byte) ((data >> 24) & 0xff),
		 (byte) ((data >> 16) & 0xff),
		 (byte) ((data >> 8) & 0xff),
		 (byte) ((data >> 0) & 0xff),
		 };
		}
	
}