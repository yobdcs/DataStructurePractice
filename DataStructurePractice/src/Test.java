import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		InputStreamTest ist = new InputStreamTest();
		
		try {
			InputStream is1 = new FileInputStream("E:\\test01.jpg");
			InputStream is2 = new FileInputStream("E:\\test02.jpg");
			
			System.out.println(is1.readAllBytes().length);
			System.out.println(is2.readAllBytes().length);
			
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