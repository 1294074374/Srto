/**
 * ��Ŀ����
��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 */
package offer;

import java.util.HashMap;

public class Solution_ɾ���������ظ��Ľ�� {
	public static void main(String[] args) {
		Solution_ɾ���������ظ��Ľ�� s = new Solution_ɾ���������ظ��Ľ��();
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
