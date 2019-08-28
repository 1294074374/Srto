package leetcode.no200_299;

import leetcode.util.ListNode;

public class No203_Solution_ÒÆ³ýÁ´±íÔªËØ {
	public ListNode removeElements(ListNode head, int val) {
		ListNode resNode = new ListNode(0);
		resNode.next = head;
		ListNode header = resNode;
		while (header.next != null) {
			if (header.next.val == val) {
				header.next = header.next.next;
			} else {
				header = header.next;
			}
		}
		return resNode.next;
	}
}
