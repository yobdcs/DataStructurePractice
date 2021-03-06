package arrayHeap;

public class MinHeap {

	class Node{
		int key;
		String str;
		
		public Node(int key, String str) {
			this.key = key;
			this.str = str;
		}
	}

	Node[] heap;
	int size = 0;

	public MinHeap(int total) {
		heap = new Node[total]; 
	}
	
	public void print() {
		for(int i = 0 ; i < size ; i ++)
			System.out.println("key: "+heap[i].key+", value: "+heap[i].str);
		System.out.println("current size: "+size);
		System.out.println("-----over----");
	}
	
	public void insert(int key, String str) {
		heap[size ++] = new Node(key, str);
		
		int index = size - 1;
		while(index > 0 || index < heap.length) {
			if(key < heap[parent(index)].key)
				index = swapUp(index, parent(index));
			else
				break;
		}	
	}
	
	private int parent(int currentIndex) {
		return (currentIndex - 1) / 2;
	}
	
	private int swapUp(int currentIndex, int parentIndex) {
		Node temp;
		temp = heap[currentIndex];
		heap[currentIndex] = heap[parentIndex];
		heap[parentIndex] = temp;
		return parentIndex;
	}
	
//	--------------------------------------------------------------------------
	
	public String remove() {
		if(size == 0)
			throw new IllegalStateException();
		
		String removedItem = heap[0].str;
		
		int index = 0;
		heap[index] = heap[-- size];
		
		while(index < size / 2) {
			if(heap[index].key > heap[child(index)].key)
				index = swapDown(index, child(index));
			else
				break;
		}
		
		return removedItem;
	}
	
	private int child(int currentIndex) {
		if(heap[currentIndex * 2 + 1].key < heap[currentIndex * 2 + 2].key)
			return currentIndex * 2 + 1;
		
		return currentIndex * 2 + 2;
	}
	
	private int swapDown(int currentIndex, int childIndex) {
		Node temp;
		temp = heap[currentIndex];
		heap[currentIndex] = heap[childIndex];
		heap[childIndex] = temp;
		return childIndex;
	}
	
}
