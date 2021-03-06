package arrayHeap;

public class minPriorityQueue {

	int size = 0;
	MinHeap queue;
	
	public void add(int priority, String value) {
		if(size == 0)
			queue = new MinHeap(6);
		
		queue.insert(priority, value);
		size ++;
	}
	
	public String remove() {
		size --;
		return queue.remove();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
