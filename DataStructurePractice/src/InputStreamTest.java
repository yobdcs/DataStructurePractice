import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class InputStreamTest {

	private File f1;
	private File f2;
	
	public InputStreamTest() {
	}
	
	public void testMerge(String s1, String s2, String out) throws IOException {
		f1 = new File(s1);
		f2 = new File(s2);
		
//		System.out.println(f1.length());

		
//		InputStream is1 = new FileInputStream(f1.getAbsolutePath());
		var is1 = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
//		InputStream is2 = new FileInputStream(f2);
		
		int a;
		int i = 0;
		int j = 0;
		while(j < 100 && (a = is1.read()) != Integer.MIN_VALUE) {
			System.out.println(Integer.toBinaryString(a));
			j ++;
		}
		
//		byte[] bArray = new byte[(int)(f1.length() + f2.length())];
		
//		is1.readNBytes(bArray, 0, (int)f1.length());
//		is2.readNBytes(bArray, (int)f1.length(), (int)f2.length());
//
//		OutputStream result = new FileOutputStream(out);
//		result.write(bArray);
//		result.flush();
//		result.close();	
	}
}
