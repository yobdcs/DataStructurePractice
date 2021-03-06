package arrayList;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.indexOf(40));
		
		Integer[] b = (Integer[]) a.toArray();
		var b1 = a.toArray(new Integer[0]);
	}

}
