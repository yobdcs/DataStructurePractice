package leetcode;

public class AddTwoNumbers {
	
	private static class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}
	
	private static class SLinkedList {
		private ListNode head;
		private ListNode current;
		
		public SLinkedList() {
		}
		
		private void appendNode(int num) {
			if(head == null) {
				head = new ListNode(num);
				return;
			}
			
			current = head;
			while(current.next != null)
				current = current.next;

			current.next = new ListNode(num);
		}
		
		private void print() {
			current = head;
			System.out.print("[");
			while(current != null) {
				System.out.print(current.val);
				current = current.next;
				
				if(current != null)
					System.out.print(",");
			}
			System.out.print("]");
		}
	}
	
	public static void main(String[] args) {
//		int[] input1 = {2, 4 ,3};
//		int[] input2 = {5, 6, 4};
		int[] input1 = {9,9,9,9,9,9,9};
		int[] input2 = {9,9,9,9};

		var list1 = new SLinkedList();
		for(var num : input1)
			list1.appendNode(num);
		
		var list2 = new SLinkedList();
		for(var num : input2)
			list2.appendNode(num);
		
		var list3 = new SLinkedList();
		list1.current = list1.head;
		list2.current = list2.head;
		while (list1.current != null && list2.current != null) {
			list3.appendNode(addTwoNumbers(list1.current, list2.current));
			list1.current = list1.current.next;
			list2.current = list2.current.next;
		}
		
		if(list1.current == null)
			check(list2, list3);
		
		if(list2.current == null)
			check(list1, list3);
		
		list3.print();
	}
	
	private static void check(SLinkedList list1, SLinkedList list3) {
		while(list1.current != null) {
			if(list1.current.val > 9) {
				list1.current.val %= 10;
				if(list1.current.next != null)
					list1.current.next.val += 1;
				else
					list1.current.next = new ListNode(1);
			}
			list3.appendNode(list1.current.val);
			list1.current = list1.current.next;
		}
	}
	
	private static int addTwoNumbers(ListNode l1, ListNode l2) {
		var temp = l1.val + l2.val;
		if(temp > 9) {
			temp %= 10 ;
			if(l1.next != null)
				l1.next.val += 1;
			else
				l2.next.val += 1;
		}
		return temp;
	}
}
