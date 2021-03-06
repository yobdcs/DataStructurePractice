package queueTest;

import java.util.Arrays;

public class ArrayQueue {

	private int[] array;
	private int front = 0;
	private int back = 0;
	private int size = 0;
	
	public ArrayQueue(int capacity) {
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
//		System.out.println("front="+front+"  back="+back+"  size="+size);
		return size == array.length;
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			throw new IllegalStateException();
		}
		array[front] = item;
		front = (front + 1) % array.length;     //circular array
		size ++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		int deq = array[back];
		array[back] = 0;
		back = (back + 1) % array.length;     //circular array
		size --;
		return deq;
	}
	
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return array[back];
	}
	
	public void print() {
		System.out.println(Arrays.toString(array));
	}

}
