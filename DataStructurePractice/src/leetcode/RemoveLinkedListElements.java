package leetcode;

public class RemoveLinkedListElements {

	/*	Given the head of a linked list and an integer val, remove all the nodes of the linked list 
	 * 
	 * 	that has Node.val == val, and return the new head.
	 */
	
	public static void main(String[] args) {

	}
	
	public class ListNode {
		
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
	
	private static ListNode removeLinkedListElements(ListNode head, int val) {
		return removeNodeR(null, head, null, val);
	}
	
	private static ListNode removeNodeR(ListNode p, ListNode c, ListNode f, int val) {
		while(c != null && c.val == val) {
			if(p == null) {
				p = c;
				c = c.next;
				p = null;
			} else {
				p.next = f = c.next;
				c = null;
				c = f;
			}
		}
        
        if(c != null && c.next != null)
            removeNodeR(c, c.next, f, val);
        
		return c;
	}
	
//	private static ListNode removeLinkedListElements2(ListNode head, int val) {
//		if (head == null)
//			return null;
//		
//		ListNode next = removeLinkedListElements2(head.next, val);
//		
//		if (head.val == val)
//			return next;
//		
//		head.next = next;
//		return head;
//	}

}
