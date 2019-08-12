/**
 * 题目描述
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
package offer;

import java.util.HashMap;

public class Solution_删除链表中重复的结点 {
	public static void main(String[] args) {
		Solution_删除链表中重复的结点 s = new Solution_删除链表中重复的结点();
		ListNode l = new ListNode(1);
		ListNode pHead = l;
		for (int i = 2; i <= 5; i++) {
			l.next = new ListNode(2);
			l = l.next;
		}
		l.next = new ListNode(3);
		System.out.println(s.deleteDuplication(pHead).val);
	}

	public ListNode deleteDuplication(ListNode pHead) {
		ListNode resNode = pHead;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (pHead == null) {
			return null;
		}
		map.put(pHead.val, 1);
		pHead = pHead.next;
		while (pHead != null) {
			// ListNode tempNode = pHead.next;
			if(pHead.next==null) {
				break;
			}
			if (map.get(pHead.val) == null) {
				map.put(pHead.val, 1);
				pHead = pHead.next;
				continue;
			} if (map.get(pHead.val) == 1 && pHead.next != null && pHead.next.next != null) {
				pHead.next = pHead.next.next;
				continue;
			} 
//			if (map.get(pHead.val) == 1 && pHead.next != null && pHead.next.next == null) {
//				pHead.next = null;
//				continue;
//			}
			pHead = pHead.next;
		}

		return resNode;
	}
}
