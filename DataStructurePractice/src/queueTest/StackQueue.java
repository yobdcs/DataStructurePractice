package queueTest;

import java.util.Stack;

public class StackQueue {
	
	private Stack<Integer> stack;
	private int size = 0;
	
	public StackQueue() {
		stack = new Stack<Integer>();
	}
	
	public void enqueue(int item) {
		stack.push(item);
		size ++;
	}
	
	public int dequeue() {
		if(stack.isEmpty()) {
			throw new IllegalStateException();
		}
		Stack<Integer> stack2 = new Stack<Integer>();
		for(int i = 1 ; i < size ; i ++) {
			stack2.push(stack.pop());
		}
		int pop = stack.pop();
		for(int i = 1 ; i < size ; i ++) {
			stack.push(stack2.pop());
		}
		size --;
		return pop;
	}
	
	public Object peek() {
		if(stack.isEmpty()) {
			return null;
		}
		Stack<Integer> stack2 = new Stack<Integer>();
		for(int i = 1 ; i <= size ; i ++) {
			stack2.push(stack.pop());
		}
		int peek = stack2.peek();
		for(int i = 1 ; i <= size ; i ++) {
			stack.push(stack2.pop());
		}
		return (Integer)peek; 
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Stack<Integer> print() {
		return stack;
	}

}
