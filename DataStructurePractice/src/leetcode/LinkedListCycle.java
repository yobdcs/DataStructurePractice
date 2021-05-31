package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	/*	Given head, the head of a linked list, determine if the linked list has a cycle in it.
	 * 
	 * 	There is a cycle in a linked list if there is some node in the list that can be reached again by 
	 * 
	 * 	continuously following the next pointer. 
	 * 
	 * 	Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
	 * 
	 * 	Note that pos is not passed as a parameter.
	 * 
	 * 	Return true if there is a cycle in the linked list. Otherwise, return false.
	 */
	
	public static void main(String[] args) {

	}
	
	class ListNode {
		
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	private static boolean linkedListCycle(ListNode head) {
		Set<ListNode> set = new HashSet<ListNode>();
		
		while(head != null) {
			if(set.contains(head))
				return true;
			
			set.add(head);
			head = head.next;
		}
		return false;
	}
	
	private static boolean linkedListCycle2(ListNode head) {
		if(head == null || head.next == null)
			return false;
		
		ListNode mae = head;
		
		head = head.next;
		mae = mae.next.next;
		while(mae != null) {
			if(head == mae)
				return true;
			
			head = head.next;
			
			if(mae.next == null)
                mae = mae.next;
            else
				mae = mae.next.next;
		}
		return false;
	}

}
