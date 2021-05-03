package leetcode;

public class MergeTwoSortedLists {

	/*  Merge two sorted linked lists and return it as a sorted list. 
	
		The list should be made by splicing together the nodes of the first two lists.
	*/
	
	public static void main(String[] args) {
//		int[] nums1 = {1, 2, 4};
//		int[] nums2 = {1, 3, 4};
		int[] nums1 = {12, 19, 29};
		int[] nums2 = {14, 18, 31};
		
		LinkedListS list1 = new LinkedListS();
		for(int i = 0 ; i < nums1.length ; i ++)
			list1.append(nums1[i]);
			
		LinkedListS list2 = new LinkedListS();
		for(int i = 0 ; i < nums2.length ; i ++)
			list2.append(nums2[i]);
		
		list1.current = list1.head;
		list2.current = list2.head;
		LinkedListS list3 = new LinkedListS();
		while(list1.current != null || list2.current != null) {
			ListNode temp = mergeTwoSortedLists(list1.current, list2.current);
			list3.append(temp.val);
			if(list1.current != null && temp.val == list1.current.val) {
				list1.current = list1.current.next;
				continue;
			}

			if(list2.current != null && temp.val == list2.current.val) {
				list2.current = list2.current.next;
				continue;
			}
		}
		
		list3.print();
	}

	private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		
		if(l2 == null)
			return l1;
		
		if(l1 == null || l2.val < l1.val)
			return l2;
		
		return l1;
	}
	
	private static class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	private static class LinkedListS {
		ListNode head;
		ListNode current;
		
		public LinkedListS() {
		}

		private void append(int val) {
			if(head == null) {
				head = new ListNode(val);
				return;
			}
			current = head;
			while(current.next != null)
				current = current.next;

			current.next = new ListNode(val);
		}

		private void print() {
			current = head;
			while(current != null) {
				System.out.print(current.val + " ");
				current = current.next;
			}
		}
	}
	
}
