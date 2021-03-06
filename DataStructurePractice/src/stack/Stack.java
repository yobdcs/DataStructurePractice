package stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {
	
	private int[] array;
	private int pointer = 0;
	
	public void print() {
		System.out.println(Arrays.toString(array));
	}
	
	public void push(int item) {
		if(isEmpty()) {
			array = new int[1];
		}
		if(pointer == array.length) {
			int[] temp = new int[pointer + 1];
			for(int i = 0 ; i < pointer ; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[pointer++] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int p = peek();
		int[] temp = new int[array.length - 1];
		for(int i = 0 ; i < array.length - 1 ; i++) {
			temp[i] = array[i];
		}
		array = temp;
		pointer --;
		return p;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int p = array[pointer - 1];
		return p;
	}
	
	public boolean isEmpty() {
		if(array == null || array.length == 0) {
			return true;
		}
		return false;
	}

}
