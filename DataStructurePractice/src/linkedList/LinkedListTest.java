package linkedList;

import java.util.Arrays;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList test = new LinkedList();
		test.addLast(10);
		test.addLast(20);
		test.addFirst(30);
		test.addFirst(40);
		test.addLast(50);
		test.print();
		System.out.println("-----");
		System.out.println(test.size());
		System.out.println("-----");
		System.out.println(test.indexOf(10));
		System.out.println(test.contains(10));
		System.out.println(test.contains(50));
		System.out.println("-----");		
//		test.removeFirst();
//		test.removeLast();
//		test.removeLast();
//		test.removeLast();
//		test.removeLast();
		test.print();
		System.out.println("-----");
		System.out.println(test.size());
		
		int[] a = test.toArray();
		System.out.println(Arrays.toString(a));
		
		test.reverse();
		int[] b = test.toArray();
		System.out.println(Arrays.toString(b));
		
		test.reverse();
		int[] c = test.toArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println(test.FindKthFromLastEnd(4));

	}

}
