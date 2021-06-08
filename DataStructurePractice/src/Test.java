import java.io.IOException;

public class Test {
	
	
	public static void main(String[] args) {
		String s1 = "D:\\projects\\test\\01.flac";
		String s2 = "D:\\projects\\test\\02.mp3";
		String s3 = "D:\\projects\\test\\99.mp3";
		
		InputStreamTest ist = new InputStreamTest();
		
		try {
			ist.testMerge(s1, s2, s3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	private static byte[] longtoBytes(long data) {
//		 return new byte[]{
//		 (byte) ((data >> 56) & 0xff),
//		 (byte) ((data >> 48) & 0xff),
//		 (byte) ((data >> 40) & 0xff),
//		 (byte) ((data >> 32) & 0xff),
//		 (byte) ((data >> 24) & 0xff),
//		 (byte) ((data >> 16) & 0xff),
//		 (byte) ((data >> 8) & 0xff),
//		 (byte) ((data >> 0) & 0xff),
//		 };
//	}
	
}