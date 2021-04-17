package searchingAlgorithum;

public class SearchingTest {

	public static void main(String[] args) {
		SearchingAlgorithum sa = new SearchingAlgorithum();

//		int[] a = {6, 2, 5, 4, 3, 7};
		int[] a = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30};
		
//		System.out.println(sa.linearSearch(a, 7));
//		System.out.println(sa.binarySearchR(a, 24));
//		System.out.println(sa.binarySearchI(a, 24));
		System.out.println(sa.ternarySearchR(a, 21));
	}
}
