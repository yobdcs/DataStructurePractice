package arrayTrie;

public class ArrayTrieTest {

	public static void main(String[] args) {
		
//		ArrayTrie t = new ArrayTrie();
		HashTableTrie t = new HashTableTrie();
		
		t.insert("dog");
		t.insert("cat");
		t.insert("dot");
		t.insert("book");
		t.insert("booklet");
		
//		t.remove("booklet");
//		System.out.println(t.contains("book"));
//		
//		System.out.println("-----------");
//		t.traversePostOrder();
		
		t.insert("car");
		t.insert("egg");
		t.insert("care");
		t.insert("card");
		t.insert("careful");
		
//		t.traversePreOrder();
//		System.out.println("-------------");
		t.autoCompletion("ca");
		
//		System.out.println(t.containsR("cat"));
		
//		String[] words = {"can", "canada", "care", "cab"};
//		System.out.println(t.longestCommonPrefix(words));
	}

}
