package leetcode;

//(use single stack)
//public class MinStack {
//
//	private int min = Integer.MAX_VALUE;
//	private Stack<Integer> s;
//	
//	public MinStack() {
//		s = new Stack<Integer>();
//	}
//
//	public void push(int val) {		
//		if(val <= min) {
//			s.push(min);
//			min = val;
//		}
//		s.push(val);
//	}
//
//	public void pop() {
//		if(s.pop() == min)
//			min = s.pop();
//	}
//
//	public int top() {
//		return s.peek();
//	}
//
//	public int getMin() {
//		return min;
//	}
//
//}

//(use linked node)
public class MinStack {
	
	private class Node {
		
		private int val;
		private int min;
		private Node next;
		
		private Node(int val, int min, Node next){
			this.val = val;
			this.min = min;
			this.next = next;
		}	
	}
	
	private Node head;
	
	public MinStack() {
	}

	public void push(int val) {		
		if(head == null)
			head = new Node(val, val, null);
		else
			head = new Node(val, Math.min(val, head.min), head);
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}

}
