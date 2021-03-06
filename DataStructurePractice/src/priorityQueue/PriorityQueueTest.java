package priorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(5);
		pq.add(1);
		pq.add(3);
		pq.add(7);
		pq.add(2);
		pq.add(6);
		pq.add(9);
		pq.add(4);
		pq.add(10);
		pq.add(8);
		
//		System.out.println(pq);
		
		while(!pq.isEmpty())
			System.out.println(pq.remove());

	}

}
