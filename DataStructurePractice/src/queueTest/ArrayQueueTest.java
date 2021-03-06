package queueTest;

public class ArrayQueueTest {

	public static void main(String[] args) {
		
		ArrayQueue aq = new ArrayQueue(6);
		System.out.println(aq.isEmpty());
		System.out.println(aq.isFull());
		System.out.println("peek : "+aq.peek());
		aq.print();
		aq.enqueue(10);
		aq.enqueue(20);
		aq.enqueue(30);
		aq.enqueue(40);
		aq.print();
		System.out.println("dequeue : "+aq.dequeue());
		aq.enqueue(50);
		aq.enqueue(60);
		System.out.println("dequeue : "+aq.dequeue());
		aq.print();
		System.out.println("peek : "+aq.peek());
		System.out.println(aq.isEmpty());
		System.out.println(aq.isFull());
		aq.enqueue(70);
		aq.print();
		aq.enqueue(80);
		aq.print();
		System.out.println("dequeue : "+aq.dequeue());
		aq.enqueue(90);
		aq.print();
		System.out.println("dequeue : "+aq.dequeue());
		System.out.println("dequeue : "+aq.dequeue());
		aq.print();
		aq.enqueue(100);
		aq.print();
		System.out.println("peek : "+aq.peek());
		aq.enqueue(110);
		aq.print();
		System.out.println("peek : "+aq.peek());
		System.out.println(aq.isFull());
		
	}

}
