import java.util.PriorityQueue;

public class PriorityQTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(7);
		pq.add(1);
		pq.add(3);
		pq.add(5);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
