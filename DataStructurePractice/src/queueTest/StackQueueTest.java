package queueTest;

public class StackQueueTest {

	public static void main(String[] args) {
		
		StackQueue sq = new StackQueue();
		
		System.out.println(sq.isEmpty());
		sq.enqueue(10);
		sq.enqueue(20);
		sq.enqueue(30);
		sq.enqueue(40);
		System.out.println("peek = "+sq.peek());
		System.out.println(sq.print());
		System.out.println("dequeue = "+sq.dequeue());
		System.out.println("peek = "+sq.peek());
		System.out.println(sq.print());
		System.out.println("dequeue = "+sq.dequeue());
		System.out.println(sq.print());
		System.out.println(sq.isEmpty());

	}

}
