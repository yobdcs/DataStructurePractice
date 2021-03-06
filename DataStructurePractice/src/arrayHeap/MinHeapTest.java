package arrayHeap;

public class MinHeapTest {

	public static void main(String[] args) {
		
//		MinHeap mh = new MinHeap(6);
//		
//		mh.insert(5, "aalexx");
//		mh.insert(3, "yobdcs");
//		mh.insert(8, "Asdfg");
//		mh.insert(4, "Json");
//		mh.insert(1, "Test");
//		mh.insert(2, "Jaaaaava");
//		
//		System.out.println("----------------");
//		mh.print();
//		
//		System.out.println("removed item: "+mh.remove());
//		System.out.println("removed item: "+mh.remove());
//		System.out.println("removed item: "+mh.remove());
//		System.out.println("removed item: "+mh.remove());
//		System.out.println("removed item: "+mh.remove());
//		System.out.println("removed item: "+mh.remove());
//		
//		System.out.println("----------------");
//		mh.print();
		
		minPriorityQueue p = new minPriorityQueue();
		
		p.add(5, "aalexx");
		p.add(3, "yobdcs");
		p.add(8, "Asdfg");
		p.add(4, "Json");
		p.add(1, "Test");
		p.add(2, "Jaaaaava");
		
		System.out.println(p.isEmpty());
		
		System.out.println("removed item: "+p.remove());
		System.out.println("removed item: "+p.remove());
		System.out.println("removed item: "+p.remove());
		System.out.println("removed item: "+p.remove());
		System.out.println("removed item: "+p.remove());
		System.out.println("removed item: "+p.remove());
		
		System.out.println(p.isEmpty());
		
	}

}
