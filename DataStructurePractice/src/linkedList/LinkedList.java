package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int item) {
			this.value = item;
		}
	}
	
	private Node first;
	private Node last;
	private int size = 0; 
	
	private boolean isEmpty() {
		return first == null;
	}
	
	private boolean onlyOneItem() {
		return first == last;
	}
	
	public void addLast(int item) {
		Node node = new Node(item);
		
		if(isEmpty())
			first = last = node; 
		else {
			last.next = node;
			last = node;
		}
		
		size ++;
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		
		if(isEmpty())
			first = last = node;
		else {
			node.next = first;
			first = node;
		}
		
		size ++;
	}
	
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		if(onlyOneItem())
			first = last = null;
		else {
			Node temp = first;
			first = first.next;
			temp.next = null;
		}
		
		size --;
	}
	
	public void removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();

		if(onlyOneItem())
			first = last = null;
		else {
			Node temp = getPrevious(last);
			last = temp;
			last.next = temp = null;
		}
		
		size --;
	}
			
	private Node getPrevious(Node last) {
		Node temp = first;
		
		while(temp.next != last)
			temp = temp.next;

		return temp;
	}
	
	public void print() {
		Node current = first;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public int size() {
		return size;
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		
		while(current != null) {
			
			if(current.value == item)
				return index;
			
			current = current.next;
			index ++;
		}
		
		return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public int[] toArray() {
		int index = 0;
		int[] a = new int[size];
		Node temp = first;
		
		while(temp != null) {
			a[index] = temp.value;
			temp = temp.next;
			index ++;
		}
		
		return a;
	}
	
//	public void reverse() {       //O(n^2)
//		if(onlyOneItem())
//			return;
//		
//		Node temp = last;
//		Node check = getPrevious(temp);
//		while(check != first) {
//			temp.next = check;
//			temp = check;
//			check = getPrevious(temp);
//		}
//	
//		temp.next = first;
//		first = last;
//		last = check;
//		last.next = check = temp = null;
//	}
	
	public void reverse() {     //O(n)
		if(isEmpty())
			return;
		
		Node temp = first;
		
		Node check = temp.next;
		while(check != null) {
			Node next = check.next;
			check.next = temp;
			temp = check;
			check = next;
		}
		
		last = first;
		first = temp;
		last.next = temp = null;
	}
	
//	public int FindKthFromLastEnd(int k) {
//		if(k > size || k <= 0) {
//			throw new IllegalArgumentException();
//		}
//		int back = 1;
//		int forward = 1;
//		Node tempF = first;
//		Node tempB = first;
//		while((forward - back) != (k-1)) {
//			tempF = tempF.next;
//			forward ++;
//		}
//		while(tempF != last) {
//			tempF = tempF.next;
//			tempB = tempB.next;			
//		}
//		return tempB.value;	
//	}
	
	public int FindKthFromLastEnd(int k) {
		if(k <= 0)
			throw new IllegalArgumentException();

		Node back = first;
		Node forward = first;
		
		for(int i = 1 ; i < k ; i++) {
			forward = forward.next;
			
			if(forward == null)
				throw new IllegalArgumentException();

		}
		
		while(forward.next != null) {
			forward = forward.next;
			back = back.next;
		}
		
		return back.value;
	}

}

