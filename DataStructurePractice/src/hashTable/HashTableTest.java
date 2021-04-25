package hashTable;

public class HashTableTest {

	public static void main(String[] args) {
		
		HashTable ht = new HashTable();
		
		ht.put(10825, "def");
		ht.put(277, "aalexx");
		ht.put(10825, "yobdcs");
		ht.put(7, "mikusannoise");
		ht.put(421, "jaaaava");
		ht.put(10825, "attack");
		
		ht.put(9582, "qwert");
		ht.put(1286454, "iii");

		ht.put(62, "test");
	
		ht.remove(7);
//		ht.remove(10825);
		System.out.println(ht.get(421));

	}

}
