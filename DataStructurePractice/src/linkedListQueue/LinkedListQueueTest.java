package linkedListQueue;

public class LinkedListQueueTest {

	public static void main(String[] args) {
		
		LinkedListQueue q = new LinkedListQueue();
		
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.print();
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
	}

}
