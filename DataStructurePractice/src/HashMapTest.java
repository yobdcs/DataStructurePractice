import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "aaa");
		hm.put(1, "bbb");
		hm.put(2, "ccc");

		System.out.println(hm);
		
		for(Integer i : hm.keySet())
			System.out.println(i);
		
		for(String i : hm.values())
			System.out.println(i);
		
		for(Entry<Integer, String> i : hm.entrySet())
			System.out.println(i);
	}

}
