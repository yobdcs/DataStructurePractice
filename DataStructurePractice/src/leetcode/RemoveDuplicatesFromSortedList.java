package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {

	/*	Given the head of a sorted linked list, delete all duplicates such that each element 
	 * 
	 * 	appears only once. Return the linked list sorted as well.
	 */
	
	public static void main(String[] args) {

	}
	
	private class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	private static ListNode removeDuplicatesFromSortedList(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
		
		ListNode current = head;
		while(current != null) {
			if(map.containsKey(current.val))
				map.get(current.val).next = current.next;
			else
				map.put(current.val, current);
			
			current = current.next;
		}
		
		return head;
	}

	private static ListNode removeDuplicatesFromSortedList2(ListNode head) {		
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.val == current.next.val)
				current.next = current.next.next;
			else
				current = current.next;
		}
		return head;
	}

}
