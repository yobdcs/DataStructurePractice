package priorityQueue;

import java.util.Arrays;

public class PriorityQueue {
	
	private int[] array = new int[3];
	private int size = 0;
	
	private void shiftItemsToLeft() {
		for(int i = 0 ; i < size - 1 ; i ++)
			array[i] = array[i + 1];
	}
		
	private int shiftItemsToRight(int item) {
		int i;
		for(i = size - 1 ; i >= 0 ; i--) {
			if(item < array[i])
				array[i + 1] = array[i];
			else
				break;
		}
		return i + 1;
	}
	
	private void resize() {
		int[] temp = new int[size * 2];
		for(int i = 0 ; i < size ; i ++)
			temp[i] = array[i];
		array = temp;
	}
		
	private boolean isFull() {
		return size == array.length;
	}
	
	public void add(int item) {
		if(isFull())
			resize();
		int i = shiftItemsToRight(item);
		array[i] = item;
		size ++;
	}
	
	public int remove() {
		if(isEmpty())
			throw new IllegalStateException();
		
		int r = array[0];
		shiftItemsToLeft();
		array[size - 1] = 0;
		
		size --;
		if(size < array.length / 3)
			resize();
		
		return r;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
//		for (int i = 0; i < array.length - 1; i++)
//			System.out.print(array[i]+",");
//		System.out.println(array[array.length - 1]);
		return Arrays.toString(array);
	}

}
