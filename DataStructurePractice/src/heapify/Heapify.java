package heapify;

public class Heapify {
	
	public Heapify(int[] values) {
		array = values;
	}

	private int[] array;
	private int index = 0;

	public void print() {
		for (int i : array)
			System.out.println(i);
	}
	
	public void sort() {
		if(index >= array.length / 2 - 1)
			return;
		
		sort(index ++);
		sort();
	}
	
	private void sort(int index) {
		if(index >= array.length / 2 - 1)
			return;
		
		int temp = 0;
		int childIndex = 0;
		if(array[index] < array[leftChild(index)]) {
			childIndex = leftChild(index);
			temp = array[index];
			array[index] = array[leftChild(index)];
			array[leftChild(index)] = temp;
		}else if(array[index] < array[rightChild(index)]) {
			childIndex = rightChild(index);
			temp = array[index];
			array[index] = array[rightChild(index)];
			array[rightChild(index)] = temp;
		}else
			return;
		
		sort(childIndex);
	}
	
	private int leftChild(int index) {
		if(index * 2 + 1 < array.length)
			return index * 2 + 1;
		return index;
	}
	
	private int rightChild(int index) {
		if(index * 2 + 2 < array.length)
			return index * 2 + 2;
		return index;
	}

}
