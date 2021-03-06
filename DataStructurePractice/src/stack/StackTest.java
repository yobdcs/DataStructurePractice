package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		s.print();
		System.out.println(s.pop());
		s.print();
		System.out.println(s.isEmpty());
	}

}
