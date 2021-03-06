package arrayHeap;

public class ArrayHeap {
	
	public ArrayHeap(int size) {
		heap = new int[size];
	}

	private int size = 0;
	private int[] heap;	
	
	public void insert(int value) {
		if(isFull())
			throw new IllegalStateException();

		heap[size] = value;
		bubbleUp(size ++);
	}

	private void bubbleUp(int index) {
		if(heap[getParent(index)] >= heap[index])
			return;
		
		swapUp(index, heap[index]);
		bubbleUp(getParent(index));			
	}
	
	private void swapUp(int index, int value) {
		heap[index] = heap[getParent(index)];
		heap[getParent(index)] = value;
	}
	
	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private boolean isFull() {
		return size == heap.length;
	}
	
//	---------------------------------------------------------------------------
	
	public int remove() {
		if(isEmpty())
			throw new IllegalStateException();
		
		int remove = heap[0];
		heap[0] = heap[-- size];
		heap[size] = 0;
		bubbleDown(0);
		
		return remove;
	}
	
	private void bubbleDown(int index) {
		if(noChild(index))
			return;

		int childIndex = getChild(index);
		
		if(heap[childIndex] > heap[index])
			swapDown(index, childIndex, heap[index]);
		
		bubbleDown(childIndex);
	}
	
	private void swapDown(int index, int childIndex, int value) {
		heap[index] = heap[childIndex];
		heap[childIndex] = value;
	}
	
	private int getChild(int index) {
		if(noChild(index))
			return 0;
		
		if(heap[leftChild(index)] > heap[rightChild(index)])
			return leftChild(index);
		
		return rightChild(index);
	}
	
	private int leftChild(int index) {
		return index * 2 + 1;
	}
	
	private int rightChild(int index) {
		return index * 2 + 2;
	}
	
	private boolean noChild(int index) {
		return index * 2 + 1 > size || index * 2 + 2 > size;
	}
	
	private boolean isEmpty() {
		return size == 0;
	}
	
//	---------------------------------------------------------------------------
	
	public int kThLargestNumber(int k) {
		if(isEmpty() || k < 1 || k > heap.length)
			throw new IllegalStateException();
		
		int l = 0;
		for(int i = 1 ; i <= k ; i ++)
			l = remove();
		return l;
	}
	
}
