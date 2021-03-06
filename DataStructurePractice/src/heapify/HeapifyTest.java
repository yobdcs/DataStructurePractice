package heapify;

public class HeapifyTest {

	public static void main(String[] args) {
		
		int[] values = {5, 3, 8, 4, 1, 2};
		Heapify h = new Heapify(values);
		
		h.sort();
		h.print();
	}

}
