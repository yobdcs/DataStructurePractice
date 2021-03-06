import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> setl = new LinkedHashSet<Integer>();
		
		int[] num = {1, 5, 3, 5, 7, 4, 9, 1, 9};
		for (int i = 0 ; i < num.length ; i++)
			setl.add(num[i]);
		
		System.out.println(setl);

	}

}
