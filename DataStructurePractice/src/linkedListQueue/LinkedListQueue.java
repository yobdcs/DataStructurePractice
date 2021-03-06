package linkedListQueue;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
	
	private LinkedList<Integer> l;
	private int size = 0;
	
	public LinkedListQueue() {
		l = new LinkedList<Integer>();
	}

	public void enqueue(int item) {
		l.addLast(item);
		size ++;
	}
	
	public int dequeue() {
		if(isEmpty())
			throw new IllegalStateException();
		size --;
		return l.removeFirst();
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		return l.peekFirst();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		System.out.println(Arrays.toString(l.toArray()));
	}

}
