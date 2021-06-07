package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

	/*	Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
	 * 
	 * 	If the two linked lists have no intersection at all, return null.
	 */
	
	public static void main(String[] args) {

	}

	public class ListNode {
		
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	private static ListNode intersectionOfTwoLinkedLists(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<ListNode>();
		
		while(headA != null) {
			set.add(headA);
			headA = headA.next;
		}
		
		while(headB != null) {
			if(set.contains(headB))
				return headB;
				
			headB = headB.next;
		}
		return null;
	}
	
	private static ListNode intersectionOfTwoLinkedLists2(ListNode headA, ListNode headB) {
		int lengthA = 0, lengthB = 0;
		ListNode pointA = headA, pointB = headB;
		
		while(pointA != null || pointB != null) {
			if(pointA != null) {
				pointA = pointA.next;
				lengthA ++;
			}
			
			if(pointB != null) {
				pointB = pointB.next;
				lengthB ++;
			}				
		}
		
		while(headA != headB) {
			if(lengthA > lengthB) {
				headA = headA.next;
				lengthA --;
				continue;
			}

			if(lengthB > lengthA) {
				headB = headB.next;
				lengthB --;
				continue;
			}

			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	
	private static ListNode intersectionOfTwoLinkedLists3(ListNode headA, ListNode headB) {
		ListNode pointA = headA, pointB = headB;
		
		while(pointA != pointB) {
			pointA = pointA == null ? headB : pointA.next;
			pointB = pointB == null ? headA : pointB.next;
		}
		return pointA;
	}
	
}
