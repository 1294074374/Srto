/*
 * 题目描述
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
package offer;

import java.util.HashMap;

public class Solution_链表中环的入口结点 {
	public static void main(String[] args) {
		Solution_链表中环的入口结点 s =new Solution_链表中环的入口结点();
		ListNode l = new ListNode(1);
		ListNode pHead = l;
		for(int i =2;i<=5;i++) {
			l.next  =new ListNode(i);
			l = l.next;
		}
		l.next =new ListNode(3);
		System.out.println(s.EntryNodeOfLoop(pHead).val);
	}
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		//ListNode tempNode = null;
		HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
		map.put(pHead, 1);
		pHead = pHead.next;
		while (pHead != null) {
			if(map.get(pHead) == null) {
				map.put(pHead, 1);
				pHead = pHead.next;
			}else {
				return pHead;
			}
			
		}
		return null;
	}
}
