package queTest;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

	public static void main(String[] args) {
			
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q);
		
		reverse(q);
		System.out.println(q);
//		System.out.println(reverse(q));

	}
	
	public static void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
	}
	
//	public static Queue<Integer> reverse(Queue<Integer> q) {
//		int s = q.size();
//		Queue<Integer> q2 = new ArrayDeque<Integer>();
//		while(!q.isEmpty()) {
//			for(int i = 1 ; i < s ; i++) {
//				q.add(q.remove());
//			}
//			q2.add(q.remove());
//			s --;
//		}
//		return q2;
//	}

}
